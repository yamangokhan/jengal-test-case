![2024-01-28_15h11_51](https://github.com/yamangokhan/jengal-test-case/assets/101811316/e357aaa9-d2d4-4624-9add-fd528c0d87fb)



#  📜 JENGAL TEST CASE 

## 🎨 KULLANILAN TEKNOLOJİLER
 - Selenium 4.15
 - Selenium WebDriver
 - Cucumber
 - Java
   
## ℹ CASE AÇIKLAMASI
 - Test Case Adı: Kayıt Ol 
 - Test Amacı: Selenium WebDriver kullanarak web sitesine yeni bir kullanıcı kaydetmeyi test edin. 

## 📦 PROJE YAPISI
- `src/test/java/base/baseUtil`: Java kodlarını initialize ederek bu class üzerinden çağırılarak kullanımı sağlayan class yapısını ifade eder.
- `src/test/java/locatorPage`: Testi gerçekleştirilecek ilgili sayfanın arayüzündeki dom yapısında bulunan html web elementlerini locate etmek için kullanımı sağlayan yapıyı ifade eder. 
- `src/test/java/stepDefinition`: Cucumber senaryolarını gerçekleştirmek için her bir test step için kodların yazıldığı class yapısını ifade eder.
- `src/test/java/testRunner`: İstediğimiz test senaryosunu "tag" yardımıyla çalışırarak proje içerisinde smoke test, regression test, integration test yapmamıza ve rapor çıktısı görüntülememize kolaylık sağlayan yapıyı ifade eder.
- `src/test/java/utilities`: Hazır methodların depolarak çağırıldığı alan olarak kullanıldığı gibi, projede yazılan testlerin koşumu için ilgili config ayarlarının yapıldığı class, ayrıca Driver class ile testlerin Selenium Webdriver ile testlerin koşturulmasını ve hangi browser ile testlerin çalıştırılmasını seçebilleceğimiz kod parçacıklarına yer verdiğimiz gibi, testlerin koşumunda browser üzerinden ilgili configurrasyonların yapıldığı yapı anlamına gelmektedir.
- `src/test/resources/features`: Test seanryolarını tanımlamak için cucumber framework tarafından sağlanan yapıyı ifade eder.
  
## 🚩TEST SENARYOLARI
 - `Test Case 1` : Geçerli ad-soyad, email, password ile yapılan başarılı giriş senaryosu.
 - `Test Case 2` : Geçersiz ad-soyad, geçerli email, password ile yapılan uygulamaya giriş senaryosu
 - `Test Case 3` : Geçersiz email, geçerli ad-soyad, password ile yapılan uygulamaya giriş senaryosu
 - `Test Case 4` : Geçersiz password, geçerli ad-soyad, email ile yapılan uygulamaya giriş senaryosu
 - `Test Case 5` : Geçersiz password doğrulaması ile yapılan uygulamaya giriş senaryosu
 - `Test Case 6` : Zorunlu alanlarında validasyonlarının test edildiği uygulamaya giriş senaryosu


## 🛟 KARŞILAŞILAN HATALAR VE HANDLE YÖNTEMLERİ
- `Mouse on Hover` :Uygula açıldığında Kayıt Ol butonu mouse hareketi olmadan görüntülenmediğinden dolayı bu test adımında kullanıcı seleniumdan gelen özellik ile Mouse On Hover action kullanarak ilgili aksiyonu tamamlamıştır.
- `reCAPTCHA Sorunu ` : Kullanıcı uygulamaya başarılı kayıt olma son aşamasında Google tarafında desteklenen reCaptcha engeli ile karşılaşmış fakat tarayı açıldıktan sonra senaryoda eklenen kod ile sorun giderilmiştir.


## 🚀 PROJE ÇALIŞTIRMA VE EKRAN GÖRÜNTÜLERİ


https://github.com/yamangokhan/jengal-test-case/assets/101811316/3e24d046-0025-43de-a0de-a1ffe545a819


## 🐞BUG

 - `Ayn email ile kayıt olma hatası hk.` : Daha önce aynı email ile kayıt edilen bir kullanıcı var ise arayüzde herhangi bir hata mesajı gösterilmezden açılan pop-up mesajı "TAMAM" olarak görüntülenmekte ve Kayıt ol butonu üzerinde tet metnin dublicate şeklinde görüntülendiği doğrulanmıştır. 
![2024-01-28_16h19_21](https://github.com/yamangokhan/jengal-test-case/assets/101811316/3005cad1-4ae1-4f4f-8026-db6e1976e611)

 - `İsim input alanına 50 karakterden fazla data girildiğinde alınan hata hk.` : isim alanı 50 karakterden fazla olacak şekilde giriş yapıldığında herhangi bir uyarı mesajı ile karşılaşılmayıp, kullanıcıya "TAMAM" pop-up mesajı gösterilmektedir. Alınan hata sonrası kullanıcı her Kayıt ol butonuna tıkladığında ise Kayıt Ol text metnin dublicate olacak şekilde buton içerisinde görüntülendiği doğrulanmıştır. 


https://github.com/yamangokhan/jengal-test-case/assets/101811316/24da15d8-f22e-4b28-bbc6-607685dec1f9

![2024-01-28_16h32_32](https://github.com/yamangokhan/jengal-test-case/assets/101811316/5d219e43-7351-44f2-960a-ea70a92d3c1e)



The MIT License (MIT) 2024 - [Gokhan YAMAN](https://github.com/yamangokhan/). Please have a look at the [LICENSE.md](LICENSE.md) for more details.

