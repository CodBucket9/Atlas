package org.charlie;

import java.net.InetAddress;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("► Enter the domain to scan: ");
        String domain = scanner.nextLine();

        String[] subdomains = {
                "www", "mail", "ftp", "admin", "blog", "shop", "api", "test", "dev",
                "app", "forum", "news", "docs", "login", "demo", "crm", "cdn", "support",
                "secure", "media", "images", "help", "my", "portal", "jobs", "download",
                "store","subdomain", "alpha", "beta" };

        for (String subdomain : subdomains) {
            String host = subdomain + "." + domain;

            try {
                InetAddress inetAddress = InetAddress.getByName(host);
                System.out.println(host + " - " + inetAddress.getHostAddress());
            } catch (Exception e) {
                System.out.println(host + " - Not found!");
            }
        }

        scanner.close();
    }
}


