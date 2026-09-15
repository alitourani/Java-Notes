import javax.crypto.KEM;
import java.util.Arrays;
import java.security.PrivateKey;
import java.security.KeyPairGenerator;
import java.security.InvalidKeyException;
import javax.crypto.DecapsulateException;
import java.security.NoSuchAlgorithmException;

public class Main {
    
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, DecapsulateException {
        // First log
        System.out.println("Java Key Encapsulation!");
        
        // Keys using Key Encapsulation Mechanism (KEM)
        final var keyPairGenerator = KeyPairGenerator.getInstance("X25519");
        final var keyPair = keyPairGenerator.generateKeyPair();
        final var publicKey = keyPair.getPublic();
        final var privateKey = keyPair.getPrivate();
        
        // [NOTE] New in Java 21
        final var sendersKem = KEM.getInstance("DHKEM");
        // Encapsulating the Sender
        final var sender = sendersKem.newEncapsulator(publicKey);
        final var encapsulated = sender.encapsulate();
        final var secretKey = encapsulated.key();
        
        final var receiversKem = KEM.getInstance("DHKEM");
        // Encapsulating the Receiver
        final var receiver = receiversKem.newDecapsulator(privateKey);
        final var receivedSecretKey = receiver.decapsulate(encapsulated.encapsulation());
        
        // Check
        if (Arrays.equals(secretKey.getEncoded(), receivedSecretKey.getEncoded())) {
            System.out.println("Keys Match!");
        } else {
            System.out.println("Keys Not Matched!");
        }
    }
}