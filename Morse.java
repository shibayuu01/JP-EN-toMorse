import java.util.Scanner;
import java.util.HashMap;
import java.text.Normalizer;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

  public class morse {
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      do {
        translateJPN();
        System.out.println("control c で終了");
      } while (true);
    }
    public static void translateJPN(){
      HashMap<Character, String> codes = new HashMap<Character, String>();
      codes.put('あ',"－－・－－");codes.put('い',"・－");codes.put('う',"・・－");codes.put('え',"－・－－－");codes.put('お',"・－・・・");
      codes.put('か',"・－・・");codes.put('き',"－・－・・");codes.put('く',"・・・－");codes.put('け',"－・－－");codes.put('こ',"－－－－");
      codes.put('さ',"－・－・－");codes.put('し',"－－・－・");codes.put('す',"－－－・－");codes.put('せ',"・－－－・");codes.put('そ',"－－－・");
      codes.put('た',"－・");codes.put('ち',"・・－・");codes.put('つ',"・－－・");codes.put('て',"・－・－－");codes.put('と',"・・－・・");
      codes.put('な',"・－・");codes.put('に',"－・－・");codes.put('ぬ',"・・・・");codes.put('ね',"－－・－");codes.put('の',"・・－－");
      codes.put('は',"－・・・");codes.put('ひ',"－－・・－");codes.put('ふ',"－－・・");codes.put('へ',"・");codes.put('ほ',"－・・");
      codes.put('ま',"－・・－");codes.put('み',"・・－・－");codes.put('む',"－");codes.put('め',"－・・・－");codes.put('も',"－・・－・");
      codes.put('や',"・－－");codes.put('ゆ',"－・・－－");codes.put('よ',"－－");
      codes.put('ら',"・・・");codes.put('り',"－－・");codes.put('る',"－・－－・");codes.put('れ',"－－－");codes.put('ろ',"・－・－");
      codes.put('わ',"－・－");codes.put('ゐ',"・－・・－");codes.put('を',"・－－－");codes.put('ゑ',"・－－・・");codes.put('ん',"・－・－・");
      codes.put('\u3099',"・・");codes.put('\u309A',"・・－－・");codes.put('ー',"・－－・－");codes.put('、',"・－・－・－");codes.put('（',"－・－－・－");codes.put('）',"・－・・－・");
      codes.put('0',"－－－－－");codes.put('1',"・－－－－");codes.put('2',"・・－－－");codes.put('3',"・・・－－");codes.put('4',"・・・・－");
      codes.put('5',"・・・・・");codes.put('6',"－・・・・");codes.put('7',"－－・・・");codes.put('8',"－－－・・");codes.put('9'," －－－－・");
      codes.put('０',"－－－－－");codes.put('１',"・－－－－");codes.put('２',"・・－－－");codes.put('３',"・・・－－");codes.put('４',"・・・・－");
      codes.put('５',"・・・・・");codes.put('６',"－・・・・");codes.put('７',"－－・・・");codes.put('８',"－－－・・");codes.put('９'," －－－－・");
      codes.put('!',"－・－・－－");codes.put('！',"－・－・－－");codes.put('?',"・・－－・・");codes.put('？',"・・－－・・");

      codes.put('a',".-");codes.put('b',"-...");codes.put('c',"-.-.");codes.put('d',"-..");codes.put('e',".");
      codes.put('f',"..-.");codes.put('g',"--.");codes.put('h',"....");codes.put('i',"..");codes.put('j',".---");
      codes.put('k',"-.-");codes.put('l',".-..");codes.put('m',"--");codes.put('n',"-.");codes.put('o',"---");
      codes.put('p',".--.");codes.put('q',"--.-");codes.put('r',".-.");codes.put('s',"...");codes.put('t',"-");
      codes.put('u',"..-");codes.put('v',"...-");codes.put('w',".--");codes.put('x',"-..-");codes.put('y',"-.--");codes.put('z',"--..");
      codes.put(' ',"/");codes.put(',',"--..--");codes.put('.',".-.-.-");codes.put('?',"..--..");codes.put('!',"-.-.--");
      codes.put('\'',".----.");codes.put('/',"-..-.");codes.put(':',"---...");codes.put('+',".-.-.");codes.put('-',"-....-");
      codes.put('=',"-...-");codes.put('×',"-..-");codes.put('\"',".-..-.");codes.put('%',"----- -..-. -----");
      codes.put('(',"-.--.");codes.put(')',"-.--.-");codes.put('@',".--.-.");codes.put('&',".-...");
      codes.put('0',"-----");codes.put('1',".----");codes.put('2',"..---");codes.put('3',"...--");codes.put('4',"....-");
      codes.put('5',".....");codes.put('6',"-....");codes.put('7',"--...");codes.put('8',"---..");codes.put('9',"----.");

      System.out.println("文字列を入力");
      Scanner scanner = new Scanner(System.in);
      String str = scanner.nextLine();
      str = Normalizer.normalize(str, Normalizer.Form.NFD);
      System.out.println("");
      String morse = "";
      for(int i = 0; i < str.length() ;i++)
      {
        String mor = (String)codes.get(str.charAt(i));
        morse = morse + mor + "　";
      }
      System.out.println(morse);
      Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
      StringSelection selection = new StringSelection(morse);
      clip.setContents(selection, null);
      System.out.println("");
    }
  }
