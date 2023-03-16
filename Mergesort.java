class Mergesort
{
    static void merge(int arr[], int l, int mid , int r)
    {

        int n1 = mid - l;
        int n2 = r - (mid + 1);

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; i++)
        {
            L[i] = arr[i];
        }
        for(int j = mid+1 ; j < n2; j++ )
        {
            R[j] = arr[j];
        }
        int i = 0, int j = 0;
        int k = l;
        while(i < n1 && j < n2)
        {
            if(L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;

        }

        while(i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
        
    }   
    static void sort(int arr[], int l, int r)
    {
        if(l < r)
        {
            int mid = l + ((r - l) / 2);
            sort(arr, l, mid);
            sort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }

    }
    static void printArray(int arr[])
    {
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) 
    {
        int array[] = {15,2,6,14,7,9,1,12,3,15,5};

        sort(array, 1, array.length);

        
    }
}