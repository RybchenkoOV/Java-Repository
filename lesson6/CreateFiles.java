package lesson6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class CreateFiles {

    public static void main(String[] args) {

        /** Создаем файл 1 */
        try {
            FileOutputStream fos1 = new FileOutputStream("file1.txt");
            PrintStream ps = new PrintStream(fos1);
            ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed lacinia varius nunc sit amet varius. Nullam dui massa, imperdiet condimentum ligula id, pretium lacinia enim. \nInteger consequat nunc vel justo porttitor, ac vehicula nunc congue. Curabitur tristique hendrerit lacus et aliquam. \nSed non sodales sapien, commodo iaculis ex. Vestibulum eget scelerisque risus. Praesent sapien eros, semper quis metus in, tincidunt blandit mauris. \nSed lectus diam, hendrerit ac tempus in, tempor sit amet nulla.\nProin a purus in lorem consequat convallis nec vel sem. Sed fringilla mi sed nisl congue blandit. Phasellus fringilla tincidunt neque, eget dapibus elit vulputate nec. \nMorbi condimentum neque tellus, ut eleifend lorem posuere ac. Sed pretium pretium interdum. Donec consequat iaculis congue. \nMauris vehicula maximus varius. Duis ut tincidunt neque. In ac est ut libero sodales sollicitudin. \nDuis lobortis placerat nulla id tempor. In porttitor a nunc a scelerisque. ");
            ps.close();
            fos1.flush();
            fos1.close();
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }

        /** Создаем файл 2 */
        try {
            FileOutputStream fos2 = new FileOutputStream("file2.txt");
            PrintStream ps1 = new PrintStream(fos2);
            ps1.println("Integer et sollicitudin purus. Phasellus at ullamcorper augue. Sed malesuada dolor purus, quis dictum diam cursus a. In vestibulum justo in tempus tristique. \nMauris congue sapien nec lacus convallis, in aliquet nibh dictum. Fusce lacinia porttitor justo in porttitor. \nQuisque sagittis augue ut est viverra volutpat. Curabitur vel nulla nulla. Aliquam mollis augue lacus, tincidunt luctus ipsum porta sed. Donec quis purus erat.\nProin a elementum eros, et tristique est. Sed ac auctor nisi. Ut ut justo ultricies, dignissim lorem vitae, dapibus erat. \nNulla eget nisi imperdiet, interdum neque non, convallis neque. Aenean magna turpis, efficitur et iaculis eget, dapibus quis lacus. \nNullam id lacus nec lacus elementum eleifend. Pellentesque tincidunt ligula eu interdum dictum. \nDonec volutpat nec nunc nec pharetra. In hac habitasse platea dictumst. In hac habitasse platea dictumst. \nIn neque neque, ultricies et odio ac, elementum rutrum ligula. Cras id est in magna scelerisque cursus et et risus. \nPraesent eu finibus est. Nunc eu mauris ac mauris pellentesque elementum a id sapien.");
            ps1.close();
            fos2.flush();
            fos2.close();
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}
