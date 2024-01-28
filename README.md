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
- `reCAPTHCA Sorunu ` : Kullanıcı uygulamaya başarılı kayıt olma son aşamasında Google tarafında desteklenen reCaptcha engeli ile karşılaşmış fakat tarayı açıldıktan sonra senaryoda eklenen kod ile sorun giderilmiştir.


## 🚀 PROJE ÇALIŞTIRMA VE EKRAN GÖRÜNTÜLERİ


https://github.com/yamangokhan/jengal-test-case/assets/101811316/3e24d046-0025-43de-a0de-a1ffe545a819


## 🐞DEFECT




The MIT License (MIT) 2024 - [Gokhan YAMAN](https://github.com/yamangokhan/). Please have a look at the [LICENSE.md](LICENSE.md) for more details.

