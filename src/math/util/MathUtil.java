/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

/**
 *
 * @author ADMIN
 */
// day la class chua cac ham toan hoc tinh toan, voi muc tieu xai chung cho cac noi khac, pham cai gi mang tinh chat xai chung, ta se dung STATIC
public class MathUtil {

    //tinh n! = 1.2.3...n. Vi n! tang gia tri rat nhanh, som tran mien int
    //int chi toi da 2ty1, nen ta xai long moi an toan
    //thuc ra 15! tolam roi, nen ta chi tinh giai thua tu 15 tro lai
    public static long computeFactory(int n) {
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("Invalid Input. n must be >=0");
        }
        if (n == 0 || n == 1) {
            return 1; // dk dừng
        }
        //sống sót đến dòng lệnh này thì n chắc chắn rơi vào 2...15 => ko cần xài else
        return n * computeFactory(n - 1); // n! = n * (n-1)!
    }
}
