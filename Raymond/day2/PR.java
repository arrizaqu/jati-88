package com.xsis.bt88.logic.day2;

public class PR {
	
	//fibonacci
	public long[] getFib(int n){
		long[] series = new long[n];
		//create first 2 series elements
        series[0] = 1;
        series[1] = 1;
       
        //create the Fibonacci series and store it in an array
        for(int i=2; i < n; i++){
                series[i] = series[i-1] + series[i-2];
        }
        return series;
	}
	
	//set data => return array
	public String[][] getDataArray(int n){
		//code
		int dimensiBaris = n;
		int dimensiKolom = n;
		long[] dataFib = getFib(n);
		int nilaiTengah = n / 2;
		
		String[][] data = new String[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++){
			for(int kolom = 0; kolom < dimensiKolom; kolom++){
				if(kolom == nilaiTengah){
					data[baris][kolom] = String.valueOf(dataFib[baris]);
				}
				else if(baris + kolom == n - 1 && kolom<nilaiTengah){
					data[baris][kolom] = String.valueOf(dataFib[n-baris-1]);
				}
				else if(baris == kolom && kolom>=nilaiTengah){
					data[baris][kolom] = String.valueOf(dataFib[n-baris-1]);
				}
				else{
					data[baris][kolom] = "";
				}
			}
		}
		return data;	
	}
			
	//menampilkan data => menampilkan array
	public void showing(int n){
		int dimensiBaris = n;
		int dimensiKolom = n;
		
		String[][] data = getDataArray(n);
		for(int baris = 0; baris < dimensiBaris; baris++){
			for(int kolom = 0; kolom < dimensiKolom; kolom++){
				System.out.print(data[baris][kolom] + "\t");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		PR jawab = new PR();
		jawab.showing(9);
	}
}
