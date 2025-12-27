## Java OOP Cargo Simulation

Bu proje, Java programlama dili kullanılarak nesne yönelimli programlama (OOP) kavramlarını temel alan bir kargo ücretlendirme sisteminin simülasyonunu içermektedir.

## Proje Özellikleri
- Interface tabanlı tasarım yaklaşımı
- Standart ve hızlı kargo türleri için ayrı sınıflar
- Polymorphism (çok biçimlilik) kullanımı
- Upcasting ve downcasting örnekleri
- Sabit değerlerin merkezi bir sınıfta yönetilmesi
- KDV hesaplama mantığının uygulanması

## Kullanılan Yapılar
- Java Interface
- Inheritance & Implements
- Polymorphism
- instanceof kontrolü
- Sabit (static final) değişkenler
- Nesne yönelimli tasarım prensipleri

## Çalışma Mantığı
- `Kargo` interface’i tüm kargo türleri için ortak metotları tanımlar
- `StandartKargo` ve `HizliKargo` sınıfları bu interface’i uygular
- Ücret hesaplamaları kargo türüne göre yapılır
- KDV oranı `SabitDegerler` sınıfı üzerinden merkezi olarak yönetilir
- Polymorphism sayesinde kargo nesneleri ortak referans üzerinden kullanılır

## Çıktılar
- Kargo türüne ait bilgiler
- Ağırlık ve mesafe bilgileri
- KDV dahil toplam ücret hesaplamaları
- Hızlı kargo için ek teslimat bilgilendirmesi

## Amaç
Bu proje, Java dilinde nesne yönelimli programlama kavramlarının anlaşılmasını ve uygulanmasını hedeflemektedir. Özellikle interface kullanımı ve polymorphism mantığını pekiştirmek amacıyla geliştirilmiştir.
