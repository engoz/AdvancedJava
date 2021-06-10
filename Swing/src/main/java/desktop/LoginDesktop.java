package desktop;

/**
 * Created by enginoz on 22.12.2017.
 */

import javax.swing.*;
import java.awt.*;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class LoginDesktop {

    /*
    public static void main(String[] args) {
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setLayout(new FillLayout());
        Browser browser = new Browser(shell, SWT.NONE);
        browser.setUrl("https://tfxtarget.turkiyefinans.com.tr");//setText(html);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)screenSize.getWidth();
        int height = (int)screenSize.getHeight();
        int x=900,y=600;
        shell.setBounds((width - x) / 2 , (height - y) / 2 , x, y);
        shell.open();

        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
            if(browser.getText().contains("https://spotfx.turkiyefinans.com.tr/jnlp")){
                //System.out.println(browser.getText().substring(browser.getText().lastIndexOf("https://spotfx.turkiyefinans.com.tr/jnlp"), browser.getText().lastIndexOf("https://spotfx.turkiyefinans.com.tr/jnlp") + 148));
                try {
                    int index = browser.getText().lastIndexOf("https://spotfx.turkiyefinans.com.tr/jnlp");
                    int index2 = browser.getText().substring(index).indexOf("\"");
                    System.out.println("::::" + index + ":" + index2);
                    System.out.println(browser.getText().substring(index, index + index2));
                    downloadFile(browser.getText().substring(index, index + index2));
                    //Thread.sleep(10000);
                    //display.dispose();

                    //Runtime.getRuntime().exec("D:/akif3.jnlp");
                    //display.close();
                } catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Login sırasında hata oluştu.\nLütfen tekrar deneyiniz.");
                }
            }
        }

        display.dispose();
    }
    */

    static void downloadFile(String fileURL) {
        try {
            System.out.println("::::" + fileURL);
            URL url = new URL(fileURL);
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpConn.getInputStream();
            String saveFilePath = "D:/akif3.jnlp";

            // opens an output stream to save into file
            FileOutputStream outputStream = new FileOutputStream(saveFilePath);

            int bytesRead = -1;
            byte[] buffer = new byte[4096];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            outputStream.close();
            inputStream.close();
        } catch (Exception e) {
            System.out.println("EXCEPTION::::" + fileURL);
        }
    }

}
