package bunadya;

/**
 *
 * @author PAN
 */
// Nama : Shofan Hakim
// Nim : 220602090
// Matakuliah : Metode Numerik
// Kelas : A - Sore
public class BuNadya {
    // Halaman 94,  Contoh 3,8
    // Fungsi f(x) yang ingin diselesaikan
    public static double f(double x) {
        return Math.exp(x) - 5 * Math.pow(x, 2);
    }

    // Turunan pertama dari fungsi f(x)
    public static double df(double x) {
        return Math.exp(x) - 10 * x;
    }

    // Metode Newton-Raphson untuk mencari akar dari f(x)
    public static double newtonRaphson(double x0, double tolerance, int maxIterations) {
        double x = x0;
        int iterations = 0;
        while (Math.abs(f(x)) > tolerance && iterations < maxIterations) {
            x = x - f(x) / df(x);
            iterations++;
        }
        return x;
    }

    public static void main(String[] args) {
        double initialGuess = 1.0; // Tebakan awal
        double tolerance = 0.00001; // Toleransi error
        int maxIterations = 100; // Jumlah iterasi maksimum
        
        // Memanggil metode Newton-Raphson untuk mencari akar
        double root = newtonRaphson(initialGuess, tolerance, maxIterations);
        
        // Menampilkan hasil
        System.out.println("Akar dari f(x) = e^x - 5x^2 adalah: " + root);
    }

}
