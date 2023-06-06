package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Marks_Card {
	
	@Id
	private  long Regster_Number;
	private String  Student_Name;
	
	private  byte kannada_Internal;
	private  int kannada_external;
	
	private  byte Englsh_Internal;
	private  int Englsh_external;
	
	private  byte Hindi_Internal;
	private  int  Hindi_external;
	
	private  byte Maths_Internal;
	private  int Maths_external;
	
	private  byte Social_Internal;
	private  int Social_external;
	
	private  byte Science_Internal;
	private  int Science_external;
	
	
	public long getRegster_Number() {
		return Regster_Number;
	}
	public void setRegster_Number(long regster_Number) {
		Regster_Number = regster_Number;
	}
	
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	
	public byte getKannada_Internal() {
		return kannada_Internal;
	}
	public void setKannada_Internal(byte kannada_Internal) {
		this.kannada_Internal = kannada_Internal;
	}
	
	public int getKannada_external() {
		return kannada_external;
	}
	public void setKannada_external(int kannada_external) {
		this.kannada_external = kannada_external;
	}
	
	public byte getEnglsh_Internal() {
		return Englsh_Internal;
	}
	public void setEnglsh_Internal(byte englsh_Internal) {
		Englsh_Internal = englsh_Internal;
	}
	
	public int getEnglsh_external() {
		return Englsh_external;
	}
	public void setEnglsh_external(int englsh_external) {
		Englsh_external = englsh_external;
	}
	
	public byte getHindi_Internal() {
		return Hindi_Internal;
	}
	public void setHindi_Internal(byte hindi_Internal) {
		Hindi_Internal = hindi_Internal;
	}
	
	public int getHindi_external() {
		return Hindi_external;
	}
	public void setHindi_external(int hindi_external) {
		Hindi_external = hindi_external;
	}
	
	public byte getMaths_Internal() {
		return Maths_Internal;
	}
	public void setMaths_Internal(byte maths_Internal) {
		Maths_Internal = maths_Internal;
	}
	
	public int getMaths_external() {
		return Maths_external;
	}
	public void setMaths_external(int maths_external) {
		Maths_external = maths_external;
	}
	
	public byte getSocial_Internal() {
		return Social_Internal;
	}
	public void setSocial_Internal(byte social_Internal) {
		Social_Internal = social_Internal;
	}
	
	public int getSocial_external() {
		return Social_external;
	}
	public void setSocial_external(int social_external) {
		Social_external = social_external;
	}
	
	public byte getScience_Internal() {
		return Science_Internal;
	}
	public void setScience_Internal(byte science_Internal) {
		Science_Internal = science_Internal;
	}
	
	public int getScience_external() {
		return Science_external;
	}
	public void setScience_external(int science_external) {
		Science_external = science_external;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Marks_Card [Regster_Number=" + Regster_Number + ", Student_Name=" + Student_Name + ", kannada_Internal="
				+ kannada_Internal + ", kannada_external=" + kannada_external + ", Englsh_Internal=" + Englsh_Internal
				+ ", Englsh_external=" + Englsh_external + ", Hindi_Internal=" + Hindi_Internal + ", Hindi_external="
				+ Hindi_external + ", Maths_Internal=" + Maths_Internal + ", Maths_external=" + Maths_external
				+ ", Social_Internal=" + Social_Internal + ", Social_external=" + Social_external
				+ ", Science_Internal=" + Science_Internal + ", Science_external=" + Science_external + "]";
	}
	
	
	
	
	
}
