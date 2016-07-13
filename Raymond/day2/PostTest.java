package com.xsis.bt88.logic.day2;

public class PostTest {
	
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
		int nilai_tengah = n / 2;
		
		String[][] data = new String[dimensiBaris][dimensiKolom];
		for(int baris = 0; baris < dimensiBaris; baris++){
			for(int kolom = 0; kolom < dimensiKolom; kolom++){
				if(n - baris - kolom == 1 && kolom <5){
					data[baris][kolom] = data[baris][kolom] = String.valueOf(dataFib[baris]);
				}
				else if(kolom>=5 && baris == kolom){
					data[baris][kolom] = data[baris][kolom] = String.valueOf(dataFib[baris]);
				}
				else if(kolom == nilai_tengah){
					data[baris][kolom] = data[baris][kolom] = String.valueOf(dataFib[baris]);
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
		PostTest jawab = new PostTest();
		jawab.showing(9);
	}
}
