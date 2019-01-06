import java.util.HashSet;
import java.util.Set;

public class Day02part2StringCompare {
    public static void main(String[] args) {

        String input = "ovfclbidieyujztrswxmckgnaw\n" +
//                "ovfclbidieyujztrswxmckgnaw\n" +
                "pmfqlbimheyujztrswxmckgnap\n" +
                "ovfqlbidhetujztrswxmcfgnas\n" +
                "gvfqebddheyujztrswxmckgnap\n" +
                "ovfqlbidheyejztrswxqekgnap\n" +
                "ovzqlbiqheyujztsswxmckgnap\n" +
                "oofqlbidhoyujztoswxmckgnap\n" +
                "ovfqlbicqeyujztrswxmckgncp\n" +
                "ovfelbidheyujltrswxmcwgnap\n" +
                "ovfqlbidheyujzerswxmchgnaf\n" +
                "bvfqlbidheyxjztnswxmckgnap\n" +
                "ovfqlbidheyugztrswamnkgnap\n" +
                "ovfqxbidheyujrtrswxmckgbap\n" +
                "ovfqlbidheyujztrdwxqckgjap\n" +
                "ovfqebiqheyujztrscxmckgnap\n" +
                "avfqlbidheyvjztkswxmckgnap\n" +
                "ovfqlbidheyujktrswxvskgnap\n" +
                "ovfqlbidheeujztrswrmckgnae\n" +
                "ovaqlbidheydjztrswxmchgnap\n" +
                "ovfqlbodweyujztpswxmckgnap\n" +
                "xvfqlbidhmyujztrswxmykgnap\n" +
                "ovfqlnidheyujztxswumckgnap\n" +
                "ovfqlbidhexujztrswxyckgeap\n" +
                "ovfqlkidhekubztrswxmckgnap\n" +
                "ovfqlbidheysjzkrsxxmckgnap\n" +
                "oxfqebidheyujzprswxmckgnap\n" +
                "ovfqlbidhetujztrswmmckghap\n" +
                "ovfclbidhuyujztrswrmckgnap\n" +
                "ovfqlbijhdyujztrswxmcvgnap\n" +
                "ovfqlkidhyyujztrswxvckgnap\n" +
                "ovfqlbiehlyujztrswxhckgnap\n" +
                "ovfqlbidheyxjjtrsdxmckgnap\n" +
                "jvfqlbidheyujztrvwxmckcnap\n" +
                "ovfvlbidheyujzhrswxmckgnzp\n" +
                "ovfqnbidhuyujztrswfmckgnap\n" +
                "ovfrlbidheyujztpswxmckgnat\n" +
                "ovfqpbidheyujztrywxmcngnap\n" +
                "ovfqlbidheyumrtrswpmckgnap\n" +
                "ovfqlbidhoyzjztrswxmckgkap\n" +
                "ovfqlbibheyuhztrswxmskgnap\n" +
                "ovfqlbidheybjzfrswxkckgnap\n" +
                "ovfqnbinheyujztrawxmckgnap\n" +
                "ovfqlbidheyujztryxxmckgnao\n" +
                "ovfqzbidheyujztrsuxmckgnpp\n" +
                "ovfqlbidherujztrswxmckgjsp\n" +
                "ovfqlbidheyujhtrywxmckgtap\n" +
                "oofmlbidheyujftrswxmckgnap\n" +
                "ovfqlbidhhyujztrawxmckgnbp\n" +
                "ovfqlbidheyujztrswxeckmnae\n" +
                "lvfqlbidheyujztrswxzckvnap\n" +
                "ovfqlbidheyujztrswxmckqnfr\n" +
                "offqlbidheyrjztrswxmwkgnap\n" +
                "ovnqlbidzeyujztmswxmckgnap\n" +
                "ovfxlbxdheyujztrawxmckgnap\n" +
                "ovfqmbidheyujztrsaxwckgnap\n" +
                "ovfqlbidhryzjztrswxmckgcap\n" +
                "offqlbidheyujnthswxmckgnap\n" +
                "ogmqlbimheyujztrswxmckgnap\n" +
                "ovfqlbidheyulztkswxockgnap\n" +
                "ovfqlbidheyujjtrswxmckypap\n" +
                "ovfqibidheypjztrswxmskgnap\n" +
                "ovfqlbwdhyyujztrswxmckgnnp\n" +
                "ovfqlbidheyujztsvwxmckgkap\n" +
                "odfqlbidoeyujztrswxjckgnap\n" +
                "ovfqlbodpeyujztrswxmcggnap\n" +
                "ovfqlbicheyujztrhwxmcagnap\n" +
                "ovfqlbidheyuaztrgwxmckhnap\n" +
                "ovfwlbidhyyujztrswtmckgnap\n" +
                "ovfqlbidgzyujztrswxmckgcap\n" +
                "ovnqlbcdheyujztrswxmckgnup\n" +
                "ovfqlbieheyujrtrsdxmckgnap\n" +
                "ovfqlbidkeyujztrswfmckgnqp\n" +
                "ovfqlbidtekujztrswxsckgnap\n" +
                "ovfklbedheyujztrscxmckgnap\n" +
                "ovfqltivhnyujztrswxmckgnap\n" +
                "ovfqlbidheyuvuyrswxmckgnap\n" +
                "ovfqlbidheyjjrtrcwxmckgnap\n" +
                "ojfqlbidheyujztrswxmckguvp\n" +
                "ovfqlbidheiqjqtrswxmckgnap\n" +
                "ivfqlfidheyujatrswxmckgnap\n" +
                "cvfqlbidheyujgtrswxmckgnrp\n" +
                "ovfclbidheeujztrswxmckgnaw\n" +
                "ovfqlbhdheyujztrswvmcklnap\n" +
                "ovfqcbidheyvjztaswxmckgnap\n" +
                "ovgqlbijheyujztrswxvckgnap\n" +
                "gvfqlbidheyujvtrswxmckgnaj\n" +
                "ovfqlbidheyujztrdwxmcggnvp\n" +
                "cvfqlbidheyujgtrswxmckqnap\n" +
                "ovfqlbrdheyqjztrswxmckgnaj\n" +
                "ovfqlbidheyujzjrswbmcrgnap\n" +
                "ovfqlbvdheyujxtrswxvckgnap\n" +
                "ovaqlbidheyujctrswxmbkgnap\n" +
                "ovfqlbidheyujztgdwxvckgnap\n" +
                "ovfqlbidhevujztrssxmwkgnap\n" +
                "rvfqlbidheyujztrzwxmckhnap\n" +
                "ovfqmbidheysjztrswxmikgnap\n" +
                "ovfqlbidheiujztrsdxuckgnap\n" +
                "ovfqlbidheyveztrswxmckgnah\n" +
                "ovfqnbiaheytjztrswxmckgnap\n" +
                "ovfqlbidnayujhtrswxmckgnap\n" +
                "ovfqlbidheyujztnswxdckgnag\n" +
                "ovfqlbidheyuyztrswxmzzgnap\n" +
                "ovfqlbiohexujzthswxmckgnap\n" +
                "lvfqlbidheyujztcswxxckgnap\n" +
                "ovuqlbidhfxujztrswxmckgnap\n" +
                "ovfqluidheyujotrswxmrkgnap\n" +
                "ovfalbidheyujztrswxhckgngp\n" +
                "ohjqlbidheyujztrswumckgnap\n" +
                "ovfqxbidhecujztrspxmckgnap\n" +
                "ovfqcbidheyusztrpwxmckgnap\n" +
                "fvfwlbidheyujztrswxmcxgnap\n" +
                "ovfqlbidhxyplztrswxmckgnap\n" +
                "ovfqlbidheyujftrswxdckgrap\n" +
                "ovfqlepdheyujztrswxmckgnjp\n" +
                "ojjqlbidhuyujztrswxmckgnap\n" +
                "ovfqlbwdheyujztrswxmcggeap\n" +
                "ovfqlbidheyujltrscxkckgnap\n" +
                "oifqibidheyujztrswxjckgnap\n" +
                "ovfqlbigheyujztrswdmcqgnap\n" +
                "ovfqlbieheyujztrswxzzkgnap\n" +
                "ovfqlbidheyujztrswmmcgbnap\n" +
                "ovfqlbidhnyujzerswxmkkgnap\n" +
                "ovfqdbinheyujztrswxeckgnap\n" +
                "oveqlbidheyujztrswhmckgnab\n" +
                "ovfqkbytheyujztrswxmckgnap\n" +
                "ovfqlbidheyujstsswxmcklnap\n" +
                "ovfimbidheyujztrewxmckgnap\n" +
                "ovfqebidhequjztrnwxmckgnap\n" +
                "ovfqlbidheyukztrswxmckunwp\n" +
                "oifqlbidheyuwztrswxmckgnao\n" +
                "ovfqlbidweyufztrswxmckgtap\n" +
                "evfqlbidheyujztrswxsckvnap\n" +
                "svbqlbidheyujztrsaxmckgnap\n" +
                "ovfqlbidheyaoztrswxmckjnap\n" +
                "ovfqllidheyujztrswxmckynhp\n" +
                "ohfqlbidheyujatrswtmckgnap\n" +
                "omfjlfidheyujztrswxmckgnap\n" +
                "xvfqlbidheyujutrswxvckgnap\n" +
                "ovfqlbidheyukztsswxmzkgnap\n" +
                "ovfqibidhehujztrswxeckgnap\n" +
                "ovfqlbydheyuoztrswxmcygnap\n" +
                "ovfqlbidheyufztrmwxmckvnap\n" +
                "ovfqrbkdheyujztrswxmckgnaq\n" +
                "ovfqlbigheyuyztrswxmckgzap\n" +
                "ovfqlbidheyujztrsjxmcnnnap\n" +
                "uvfqlbipheyujztrswxmckgnay\n" +
                "ovfqlbddneyujbtrswxmckgnap\n" +
                "tvfqlbidheyujztrswxpckgeap\n" +
                "ovfqlbidheyuiztrhwxmckznap\n" +
                "ovfqlbidheyujzteswxvckgvap\n" +
                "avfqlbidheyijzlrswxmckgnap\n" +
                "oqfqmbidheyujvtrswxmckgnap\n" +
                "ovnqlbidneyujztrswxmckxnap\n" +
                "ovfqlbidfeyujztrswxqckgncp\n" +
                "ovfaybidheyujztrswxrckgnap\n" +
                "ovfqlbidhemujzarnwxmckgnap\n" +
                "ovfqlwidheyujctrsfxmckgnap\n" +
                "ovtelbidheysjztrswxmckgnap\n" +
                "ovfqlbidheyujztrswsmchunap\n" +
                "pvfqlbidheyulztrswxmckynap\n" +
                "ovfqlbzdhezujztfswxmckgnap\n" +
                "ozfqibidheyujztrhwxmckgnap\n" +
                "ovfqlbioheycjztmswxmckgnap\n" +
                "ovfqleidheyujztoswxmckgnhp\n" +
                "ovfqlcidhejujztrswnmckgnap\n" +
                "eqfqlbidheyujztrswxmrkgnap\n" +
                "ovfqlbitheywjztrmwxmckgnap\n" +
                "ovfqlbidheyujptrswnmcggnap\n" +
                "oofqlbidhjyujztrswxmcegnap\n" +
                "ovfqlbidmeyujztrswxmcxgnxp\n" +
                "ovjhlbidhefujztrswxmckgnap\n" +
                "ovfqlbidkeyujzarswxmcugnap\n" +
                "hvyqlridheyujztrswxmckgnap\n" +
                "ovfqlbidheyujxtrswqmckgnpp\n" +
                "ovfqlbidheyuiztrtsxmckgnap\n" +
                "ovfqlbidqeyuuztrbwxmckgnap\n" +
                "ovfqpbidheyujztrswxwekgnap\n" +
                "ovfqltidheyujztrbwxmckgnab\n" +
                "okfxluidheyujztrswxmckgnap\n" +
                "ovfplbidheyujztrsaxmckgnax\n" +
                "wvfqlbidheiujztrswxjckgnap\n" +
                "ovfqlbidheyqjzlrsqxmckgnap\n" +
                "ovfqlbadheyujztrsxxmckgnop\n" +
                "ovfqliidheyujzerswvmckgnap\n" +
                "ovlrlbidheyujztaswxmckgnap\n" +
                "cvzqlbidheyujgtrswxmckqnap\n" +
                "ovfqlbidheyujzuqswxmckgnnp\n" +
                "ovfqlsjdheyujztrswxmcklnap\n" +
                "ovrqlbidheyujztrssrmckgnap\n" +
                "ovcqlbidheyujztrsmxmcognap\n" +
                "ovcqlbidheyjjztrswxmckunap\n" +
                "ovfilbrdhnyujztrswxmckgnap\n" +
                "ovfqlbodheyujztrswxeckqnap\n" +
                "ovfqlbidhuyujqtrswxdckgnap\n" +
                "ovmqlbidheyujderswxmckgnap\n" +
                "ovfylbidheyajzrrswxmckgnap\n" +
                "ovfklbidhtyujzjrswxmckgnap\n" +
                "rvfqlbidheyujztcswxcckgnap\n" +
                "ovfnlyidheyuwztrswxmckgnap\n" +
                "ovfqlbidhexujztrswxmpktnap\n" +
                "ovfplbidheyfjztrswhmckgnap\n" +
                "oyfqlbidmexujztrswxmckgnap\n" +
                "mvfqlbidhcyujztrawxmckgnap\n" +
                "ovfqlbidhqyujdtrswxmcbgnap\n" +
                "ovfqjbidheybjrtrswxmckgnap\n" +
                "ozfqlbidhbyujztrswxmckgpap\n" +
                "okfqlbidheyujztrmwxmckhnap\n" +
                "ovfqlbydheyujzrrswxnckgnap\n" +
                "ovfqtbidheycjztrswxmckgnah\n" +
                "avfqloidheyujztrswxyckgnap\n" +
                "ovfqlbldteyujzyrswxmckgnap\n" +
                "ovfqlbpdhedujztpswxmckgnap\n" +
                "ovfqlbidheyujztrswxucrvnap\n" +
                "ocnqlbidheyujztrswxmwkgnap\n" +
                "ovfqlvidheyujztrswkmckgnlp\n" +
                "evfqlbidheyujzmrswqmckgnap\n" +
                "ovfqlbidhryujztrcwxmekgnap\n" +
                "ovfqlbvdheyujztrzwxmcxgnap\n" +
                "ovfqlridgeyujztrswxmkkgnap\n" +
                "yvfqlbidheyujzthswzmckgnap\n" +
                "ovfqlbidheyujmtrswxyukgnap\n" +
                "ovfqlbidheqgjztrswdmckgnap\n" +
                "dvfzlcidheyujztrswxmckgnap\n" +
                "jvfqlbidheyujztrswxmczgnae\n" +
                "ovfqlbzdheyujztrswxyckgnjp\n" +
                "ovfqlbxdheyujatrswxmcqgnap\n" +
                "ovftlbldheyujztrewxmckgnap\n" +
                "owfqlbitheyujzyrswxmckgnap\n" +
                "ovfqlbidheyujztrswxmchgtvp\n" +
                "ovfqibidheyujzttswxmkkgnap\n" +
                "ovkqlbodheyujztvswxmckgnap\n" +
                "onfqlbbdheyujztrxwxmckgnap\n" +
                "ovfqlbidyeysgztrswxmckgnap\n" +
                "ovfqlbixherujztrswxmcngnap\n" +
                "ovlqlbidfeyujztrswxgckgnap\n" +
                "ovfqlbfdheyujztwswumckgnap\n" +
                "ovfqlbidheeujztrswxmckgkah\n" +
                "ovfqtbqdheyujztrswmmckgnap\n" +
                "bbfqlbigheyujztrswxmckgnap\n" +
                "ovfqljidheyujztrswxmwkgnip\n" +
                "ovfqobidheyujztrsvxmmkgnap\n" +
                "ovfqlbidheydjvtrswxmckanap\n" +
                "ovfqlxidheyujztrswgmckgnep\n" +
                "jvfqlbidhzyujztrswxmckgnay\n" +
                "ovfqlbidhkyujztrswxmlkenap\n" +
                "ovfqobidheyujztrswxmckjnaf\n" +
                "ovfxlbidheyujztrswxmcbgnac\n" +
                "ovfqcbidhtyujztrswxmckqnap\n" +
                "ozfglbidheyujzvrswxmckgnap\n" +
                "ovfqlbidheyujztoswxyckcnap";

        String[] inputArray = input.split("\n");

        for (int j = 0; j < inputArray[0].length(); j++) {
            Set<String> uniqueID = new HashSet<>();


            for (int i = 0; i < inputArray.length; i++) {
                StringBuilder tempString = new StringBuilder(inputArray[i]);
                String idWithoutChar = tempString.deleteCharAt(0).toString();

                if (uniqueID.contains(idWithoutChar)) {
                    System.out.println(idWithoutChar);
                } else {
                    uniqueID.add(idWithoutChar);
                }
            }
        }
    }
}
