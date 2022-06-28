# Java_Miniproject
This is our SE java mini project repo. In this we are trying to build an encryption tool to encrypt and decrypt a given inmage

---

The main objective of this project is to secure a sensitive image by encrypting it with a key that is unique and must not be shared randomly
While decrypting the **same** key must be used to get the original image back

We are using the XOR algorithm to encrypt the image, which is converted into byte-array, using a secret key
To decrypt, we again convert the encrypted image into byte-array and XOR it with the **same** secret key

---

To test/run it yourself:
- Clone the repo
- Make sure you have java installed on your machine
- Run the main file 

  to compile - <code>javac 'FileName.java'</code> 
  
  to run - <code>java 'FileName.java'</code>  
  
- Enter the key(a number)
- Browse and select the image
- For Encrypting
  - Click on Encrypt
- For decrypting
  - Click on Decrypt

---
