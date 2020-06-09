import java.util.Scanner;


public class Desafio {
	public static void main(String[] args){
		int X=0,Y=0;
		String AA="-",AB="-",AC="-",AD="-",AE="-",AF="-",AG="-",AH="-";
		String BA="-",BB="-",BC="-",BD="-",BE="-",BF="-",BG="-",BH="-";
		String CA="-",CB="-",CC="-",CD="-",CE="-",CF="-",CG="-",CH="-";
		String DA="-",DB="-",DC="-",DD="-",DE="-",DF="-",DG="-",DH="-";
		String EA="-",EB="-",EC="-",ED="-",EE="-",EF="-",EG="-",EH="-";
		String FA="-",FB="-",FC="-",FD="-",FE="-",FF="-",FG="-",FH="-";
		String GA="-",GB="-",GC="-",GD="-",GE="-",GF="-",GG="-",GH="-";
		String HA="-",HB="-",HC="-",HD="-",HE="-",HF="-",HG="-",HH="-";
		
		Scanner code = new Scanner(System.in);
		
		System.out.println("JOGADAS POSSÍVEIS COM TORRE");
		System.out.println("   1 2 3 4 5 6 7 8");
		System.out.println(" -----------------");
		System.out.println(" 1 "+AA+" "+AB+" "+AC+" "+AD+" "+AE+" "+AF+" "+AG+" "+AH);
		System.out.println(" 2 "+BA+" "+BB+" "+BC+" "+BD+" "+BE+" "+BF+" "+BG+" "+BH);
		System.out.println(" 3 "+CA+" "+CB+" "+CC+" "+CD+" "+CE+" "+CF+" "+CG+" "+CH);
		System.out.println(" 4 "+DA+" "+DB+" "+DC+" "+DD+" "+DE+" "+DF+" "+DG+" "+DH);
		System.out.println(" 5 "+EA+" "+EB+" "+EC+" "+ED+" "+EE+" "+EF+" "+EG+" "+EH);
		System.out.println(" 6 "+FA+" "+FB+" "+FC+" "+FD+" "+FE+" "+FF+" "+FG+" "+FH);
		System.out.println(" 7 "+GA+" "+GB+" "+GC+" "+GD+" "+GE+" "+GF+" "+GG+" "+GH);
		System.out.println(" 8 "+HA+" "+HB+" "+HC+" "+HD+" "+HE+" "+HF+" "+HG+" "+HH);
		System.out.println(" -----------------");
		System.out.println("Digite o número da coluna que deseja inserir a torre");
		{while((X == 0)|((X<1)&(X>8))){	
			try{
			 X = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Opção inválida, tente de novo!");
			}}
		System.out.println("Agora o número da linha que deseja inserir a torre");
		{while((Y == 0)|((Y<1)&(Y>8))){	
			try{
			 Y = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Opção inválida, tente de novo!");
			}}
		if (X==1){AA = "+";BA = "+";CA = "+";DA = "+";EA = "+";FA = "+";GA = "+";HA = "+";}
		else if (X==2){AB = "+";BB = "+";CB = "+";DB = "+";EB = "+";FB = "+";GB = "+";HB = "+";}
		else if (X==3){AC = "+";BC = "+";CC = "+";DC = "+";EC = "+";FC = "+";GC = "+";HC = "+";}
		else if (X==4){AD = "+";BD = "+";CD = "+";DD = "+";ED = "+";FD = "+";GD = "+";HD = "+";}
		else if (X==5){AE = "+";BE = "+";CE = "+";DE = "+";EE = "+";FE = "+";GE = "+";HE = "+";}
		else if (X==6){AF = "+";BF = "+";CF = "+";DF = "+";EF = "+";FF = "+";GF = "+";HF = "+";}
		else if (X==7){AG = "+";BG = "+";CG = "+";DG = "+";EG = "+";FG = "+";GG = "+";HG = "+";}
		else if (X==8){AH = "+";BH = "+";CH = "+";DH = "+";EH = "+";FH = "+";GH = "+";HH = "+";}
		
		if (Y==1){AA = "+";AB = "+";AC = "+";AD = "+";AE = "+";AF = "+";AG = "+";AH = "+";}
		else if(Y==2){BA = "+";BB = "+";BC = "+";BD = "+";BE = "+";BF = "+";BG = "+";BH = "+";}
		else if(Y==3){CA = "+";CB = "+";CC = "+";CD = "+";CE = "+";CF = "+";CG = "+";CH = "+";}
		else if(Y==4){DA = "+";DB = "+";DC = "+";DD = "+";DE = "+";DF = "+";DG = "+";DH = "+";}
		else if(Y==5){EA = "+";EB = "+";EC = "+";ED = "+";EE = "+";EF = "+";EG = "+";EH = "+";}
		else if(Y==6){FA = "+";FB = "+";FC = "+";FD = "+";FE = "+";FF = "+";FG = "+";FH = "+";}
		else if(Y==7){GA = "+";GB = "+";GC = "+";GD = "+";GE = "+";GF = "+";GG = "+";GH = "+";}
		else if(Y==8){HA = "+";HB = "+";HC = "+";HD = "+";HE = "+";HF = "+";HG = "+";HH = "+";}
		
		System.out.println("JOGADAS POSSÍVEIS NA POSIÇÃO "+X+"-"+Y);
		System.out.println("   1 2 3 4 5 6 7 8");
		System.out.println(" -----------------");
		System.out.println(" 1 "+AA+" "+AB+" "+AC+" "+AD+" "+AE+" "+AF+" "+AG+" "+AH);
		System.out.println(" 2 "+BA+" "+BB+" "+BC+" "+BD+" "+BE+" "+BF+" "+BG+" "+BH);
		System.out.println(" 3 "+CA+" "+CB+" "+CC+" "+CD+" "+CE+" "+CF+" "+CG+" "+CH);
		System.out.println(" 4 "+DA+" "+DB+" "+DC+" "+DD+" "+DE+" "+DF+" "+DG+" "+DH);
		System.out.println(" 5 "+EA+" "+EB+" "+EC+" "+ED+" "+EE+" "+EF+" "+EG+" "+EH);
		System.out.println(" 6 "+FA+" "+FB+" "+FC+" "+FD+" "+FE+" "+FF+" "+FG+" "+FH);
		System.out.println(" 7 "+GA+" "+GB+" "+GC+" "+GD+" "+GE+" "+GF+" "+GG+" "+GH);
		System.out.println(" 8 "+HA+" "+HB+" "+HC+" "+HD+" "+HE+" "+HF+" "+HG+" "+HH);
		System.out.println(" -----------------");}}}}