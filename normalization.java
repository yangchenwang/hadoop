package JinYong;

import org.apache.hadoop.io.WritableComparable;

public class normalization {

	/**
	 * @param args
	 */
	public class WordPair implements WritableComparable<WordPair>
	{
		private String wordA;
		private String wordB;
		
		//重写hashcode方法
		private int hashCode(){
			return (wordA.hashCode() + wordB.hashCode())*17;
		}
		
		//重写equals方法
		public boolean equals(Object o){
			//无序对，不考虑顺序
			if(!(o instanceof WordPair))
				return false;
			WordPair w = (WordPair) o;
			if((this.wordA.equals(w.wordA)&&this.wordB.equals(w.wordB))||(this.wordB.equals(w.wordA)&&this.wordA.equals(w.wordB)))
				return true;
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
