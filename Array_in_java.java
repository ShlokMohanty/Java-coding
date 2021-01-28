import java.util.ArrayList;
public class Array{
	public static void main(String[] args){
		ArrayList<String> merge(String[] words,String[] more){
			ArrayList<String> sentence = new ArrayList<String>();
		for (String w : words) sentence.add(w);
	for(String w : more) sentence.add(w);
	System.out.println(sentence);
}
