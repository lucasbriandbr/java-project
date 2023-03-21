package Functions.Encryption;

//  Importer les librairies
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

//  Constructeur
public class encrypt {

    //  Définir la méthode de cryptage
    public String Encrypt(String password,String key){

        //  Essayer de crypter le mot de passe
        try {

            //  Définir la clé
            Key clef = new SecretKeySpec(key.getBytes("ISO-8859-2"),"Blowfish");

            //  Définir le cryptage
            Cipher cipher=Cipher.getInstance("Blowfish");

            //  Crypter le mot de passe
            cipher.init(Cipher.ENCRYPT_MODE,clef);

            //  Retourner le mot de passe crypté
            return new String(cipher.doFinal(password.getBytes()));
        
        //  Si une erreur survient
        } catch (Exception e) {

            //  Retourner null
            return null;

        }

    }

}