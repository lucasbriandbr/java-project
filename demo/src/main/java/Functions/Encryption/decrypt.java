package Functions.Encryption;

//  Importer les librairies
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

//  Constructeur
public class decrypt {

    //  Définir la méthode de cryptage
    public String Decrypt(String password,String key){

        //  Essayer de décrypter le mot de passe
        try {

            //  Définir la clé
            Key clef = new SecretKeySpec(key.getBytes("ISO-8859-2"),"Blowfish");

            //  Définir le cryptage
            Cipher cipher=Cipher.getInstance("Blowfish");

            //  Décrypter le mot de passe
            cipher.init(Cipher.DECRYPT_MODE,clef);

            //  Retourner le mot de passe décrypté
            return new String(cipher.doFinal(password.getBytes()));
        
        //  Si une erreur survient
        } catch (Exception e) {

            //  Retourner null
            return null;

        }

    }
    
}
