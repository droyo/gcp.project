package com.github.droyo.gcpdemo;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;

public class GcpDemo {
  public static void main(String[] args) {
    try {
      GoogleCredential credential = GoogleCredential.getApplicationDefault();
      System.out.println("Service account: " + credential.getServiceAccountId());
    } catch (Throwable t) {
      t.printStackTrace();
      System.exit(1);
    }
  }
}
