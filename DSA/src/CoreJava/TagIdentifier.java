package CoreJava;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagIdentifier {
/**
 * creates an Instance of TagIdentifier to find the tags in a file .
 * <p>
 * The euclidean distance will be used as default distance measure.
 *
 * @param inputFilePath the name and address of the output file
 * @param OutputFilePath the name and address of the file that should be read
 * @param fieldSeparator the character for split the fields in line
 * @param keywords the list of tag/keyword which should be found
 * @throws IOException 
 * @throws FileNotFoundException, IOException
 */
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<String> keys = new ArrayList<String>(); 
		keys=Arrays.asList(new String[]{"place_of_worship", "place of worship", "religious_administration", "cathedral", "chapel", "mosque"," church", " temple", " Religion", " animist", " bahai", " buddhist", " christian", " hindu", " jain", " jewish", " multifaith", " muslim", " pagan", " pastafarian", " scientologist", " shinto", " sikh", " spiritualist", " taoist", " unitarian", " yazidi", " zoroastrian", " nichiren", " jodo_shinshu", " jodo_shu", " vajrayana", " shingon_shu", " zen", " thai_mahanikaya", " thai_thammayut", " ahmadiyya", " alaouite", " druze", " ibadi", " ismaili", " nondenominational", " shia", " sunni", " sufi", " asatru", " celtic", " greco-roman", " wicca", " EVKdFSMiD", " VKdFSMA", " CotFSM", " irani", " parsi", " alternative", " ashkenazi", " buchari", " conservative", " egalitarian", " hasidic    ", " humanistic    ", " kabbalistic   ", " karaite   ", " liberal   ", " lubavitch ", " lubavitch_messianic   ", " mizrachi_baghdadi ", " mizrachi_chida    ", " mizrachi_jerusalemite ", " mizrachi_livorno  ", " mizrachi_moroccan ", " modern_orthodox   ", " neo_orthodox  ", " nondenominational ", " orthodox", " Orthodox Judaism", " orthodox_ashkenaz ", " orthodox_sefard   ", " progressive   ", " reconstructionist ", " reform    ", " renewal   ", " samaritan ", " sefardi   ", " sefardi_amsterdam ", " sefardi_london    ", " traditional   ", " ultra_orthodox    ", " unaffiliated  ", " yemenite  ", " yemenite_baladi   ", " yemenite_shami    ", " Devi/Bhagavati", " Krishna", " Siva", " Parasurama", " Muthappan", " adventist", " alliance", " anglican", " assemblies_of_god", " apostolic", " armenian_apostolic", " assyrian", " baptist", " catholic", " catholic_apostolic", " christ_scientist", " christian_community", " church_of_scotland", " church_of_sweden", " coptic_orthodox", " czechoslovak_hussite", " dutch_reformed", " episcopal", " evangelical", " evangelical_covenant", " exclusive_brethren", " foursquare", " greek_catholic", " greek_orthodox", " iglesia_ni_cristo", " jehovahs_witness", " kimbanguist", " living_waters_church", " lutheran", " mariavite", " maronite", " mennonite", " messianic_jewish", " methodist", " mission_covenant_church_of_sweden", " moravian", " mormon", " nazarene", " new_apostolic", " nondenominational", " orthodox", " old_believers", " old_catholic", " pentecostal", " philippine_independent", " polish_catholic", " polish_national_catholic", " presbyterian", " protestant", " quaker", " reformed", " roman_catholic", " russian_orthodox", " salvation_army", " santo_daime", " serbian_orthodox", " seventh_day_adventist", " spiritist", " united", " united_church_of_christ", " united_free_church_of_scotland", " united_methodist", " united_reformed", " uniting"});
		TagIdentifierFind(",", keys);
		
	}
	
	
static public void TagIdentifierFind(String fieldSeparator,List<String> keywords )
        throws FileNotFoundException, IOException {
    /*Create a file to write the result in*/
    //FileWriter fileStream = new FileWriter(OutputFilePath, false);
    //BufferedWriter fileResult = new BufferedWriter(fileStream);
    /* Create a file reader and buffer the data */
    //FileReader flickrFileReader = new FileReader(inputFilePath);
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    //StringBuffer stringBuffer = new StringBuffer();
    String line;
    int linecount = 0;
    
    	line = bufferedReader.readLine();
        linecount++;
        for (String keyword : keywords) {
            //keyword = "//b"+keyword+"//b";
            Pattern p = Pattern.compile(keyword, Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(line);
            if(m.find()){
                System.out.println(line);
                
                break;
            }
    
    }
}
}
