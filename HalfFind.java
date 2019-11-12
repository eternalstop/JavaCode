class HalfFind{
    public static void main(String[] args) {
        int [] arr = {1, 8, 11, 23, 27, 31, 97, 114, 117, 119, 777};
        int goal = 77;
        int index = -1;
        int min = 0;
        int max = arr.length - 1;
        while (min <= max){
            int mid = (min + max) / 2;
            if (arr[mid] == goal){
                index = mid;
                break;
            }
            else if (arr[mid] > goal){
                max = mid - 1;
            }
            else {
                min = mid + 1;
            }
        }
        if (index == -1){
            System.out.println("数组中中无目标！！返回： " + index);
        }
        else {
            System.out.println("目标索引为： " + index);
        }
    }
}