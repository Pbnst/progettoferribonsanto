public class statistiche {
	private String text;
	public statistiche(String unTesto)
	{
	 text = unTesto;
	}
	public int stat(String word)
	{
	 int result = 0;
	 for (int i = 0; i <= (text.length() - word.length()); i++)
	 {
	 if(text.substring(i,i+word.length()).toUpperCase().equals(word.toUpperCase()))
		 result++;
	 }
	return result;
	}
	
	public void stampaStatistiche()
	{
		 String word = "part time";
		 String word2 = "full time";
		 String word3 = "remoto";
		 String word4 = "sede";
		 double numero_part = this.stat(word);
		 double numero_full = this.stat(word2);
		 double numero_no = this.stat(word4);
		 double numero_rem = this.stat(word3);
		 double tot1= numero_part + numero_full;
		 double tot2= numero_no + numero_rem;
		 double ris1= numero_part / tot1 *100;
		 double ris2= numero_full / tot1 *100;
		 double ris3= numero_rem / tot2 *100;
		 double ris4= numero_no / tot2 *100;
		 System.out.println(ris1);
		 System.out.println(ris2);
		 System.out.println(ris3);
		 System.out.println(ris4);
	}
}
