package poo_p1_pract10_math;

/**
 *
 * @author erick
 */
public class Gestor {
    public static boolean repetido(int n, int[] nums, int generados ){
        boolean res = false;
        for (int i = 0; i < generados; i++){
            if (n == nums[i]){
                res = true;
                break;
            }
        }
        return res;
    }
    
    private static void ordenar(int[]nums){
        int aux;
        for(int i=0;i<nums.length;i++)
            for(int k=i;k<nums.length;k++){
                aux=nums[i];
                nums[i]=nums[k];
                nums[k]=aux;
            }
    }
    
    public int[] getOrdenar(int []nums){
        this.ordenar(nums);
        return nums;
    }

    public static void mostrar(int[]nums){
        for(int num:nums)
            System.out.print(num+",");
    }
}
