package com.xsis.bt88.day3;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class PostTest {
		public static void main(String ars[]) throws IOException
	    {
	        InputStreamReader isr = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(isr);
	        System.out.println("Masukan Angka : ");
	        String angka = br.readLine();
	        int n = Integer.parseInt(angka);
	        PostTest soal = new PostTest();
	        soal.showData(n);
	    }
	   
	    
	    public int[] getFibbo(int n)
	    {
	        int[] dtfib = new int[n];
	        //Get 
	        int angka1=0;
	        int angka2=0;
	        for(int y = 0; y < n; y++)
	        {
	            if(y < 2)
	                dtfib[y]=1;
	            else
	                dtfib[y] = dtfib[y - 1] + dtfib[y - 2];
	        }
	        return dtfib;
	    }
	    
	    public String[][] setData(int n)
	    {
	        String[][] data= new String[n*2-1][n];
	        int[] dtfib = getFibbo(n);
	        int total=2*n-1;
	        for(int y =0; y < n; y++){
	            for(int x = 0; x <(n*2)-1; x++){
	                if (y+x==n-1){
	                    data[x][y]=dtfib[x]+"\t";
	                	//data[x][y]="*";
	                }
	                else if(y==x){
	                    data[x][y]=dtfib[x]+"\t";
	                	//data[x][y]="*";
	                }
	                else if(x-y==n-1){
	                    data[x][y]=dtfib[n-y-1]+"\t"; //total-x-1 atas kiri
	                    //data[x][y]="*";
	                 }
	                else if((y+x)+1==(n*2)-1){
	                    data[x][y]=dtfib[total-x-1]+"\t";
	                    //data[x][y]="*";
	                }
	                
	            }
	        }
	        return data;
	    }
	    
	    public void showData(int n)
	    {
	        String[][] data = setData(n);
	        System.out.println("== Menampilkan data : "+ n +" ==");
	       
	        for(int y = 0; y < n; y++)
	        {
	            for(int x= 0; x < (n*2)-1; x++)
	            {
	                if(data[x][y] == null)
	                {
	                    data[x][y] =  "\t";//x +"."+ y +
	                }
	                System.out.print(data[x][y]);
	            }
	            
	            System.out.println("");
	        }
	        
	    }


}
