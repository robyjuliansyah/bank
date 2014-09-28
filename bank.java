import java.util.Scanner;
public class bank
{	public static void main(String[] args)
	{	Scanner input=new Scanner(System.in);
		int x = 1;
		int ambil, setor, menu;
		long saldo = 50000;
		while (x<2)
		{	ambil = 0;
			setor = 0;
			menu = 5;
			System.out.println("**************************************************");
 			System.out.println("*                   BANK TOYIB                   *");
			System.out.println("**************************************************");
 			System.out.println("* 1. Ambil uang                                  *");
			System.out.println("* 2. Setor uang                                  *");
			System.out.println("* 3. Cek saldo                                   *");
			System.out.println("* 4. Keluar                                      *");
 			System.out.println("**************************************************");
			System.out.print  ("Pilih Menu : ");
			menu = input.nextInt();
			switch (menu)
 			{	case 1 :
 					System.out.println("**************************************************");
					System.out.print  ("* Berapa uang yang akan diambil? ");
					ambil = input.nextInt();
					System.out.println("**************************************************");
					if(saldo - ambil < 50000)
 					{	System.out.println("* maaf saldo minimal Rp. 50.000");	}
					else
 					{	saldo = saldo - ambil;
						System.out.println("* anda berhasil mengambil uang sebesar Rp. "+ambil);
						System.out.println("* sisa saldo anda sekarang Rp. "+saldo);
					}
					System.out.println("**************************************************\n\n");
				break;
				case 2 :
					System.out.println("**************************************************");
					System.out.print  ("* Berapa uang yang akan disetorkan? ");
					setor = input.nextInt();
					System.out.println("**************************************************");
					if(setor < 0)
					{	System.out.println("* maaf uang anda tidak berlaku                   *");	}
					else
					{	saldo = saldo + setor;
						System.out.println("* anda berhasil menyetorkan uang sebesar Rp. "+setor);
						System.out.println("* jumlah saldo anda sekarang Rp. "+saldo);
					}
					System.out.println("**************************************************\n\n");
				break;
				case 3 :
					System.out.println("**************************************************");
					System.out.println("* jumlah saldo anda sekarang Rp. "+saldo);
					System.out.println("**************************************************\n\n");
				break;
				case 4 :
					x = 4;
				break;
				default:
					System.out.println("**************************************************");
					System.out.println("*                  salah  input                  *");
					System.out.println("**************************************************\n\n");
				break;
			}
		}
	}
}
