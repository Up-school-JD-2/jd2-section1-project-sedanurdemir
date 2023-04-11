import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int choice = 0;
	    int choice2=0;
	    
	    int userCounter=0;
	    int filmCounter=0;
	    MovieManager movieManager=new MovieManager();
	    UserManager userManager=new UserManager();
	   
//	    Sisteme giriş yapmak için ilk do-while döngsü çalışacak
	    printEnterMenu();
	    
	    do {
			System.out.println("seçimizi giriniz: ");
			choice =sc.nextInt();
			
			switch (choice) {
//			Yeni kullanıcı eklemek için
			case 1-> {
				 sc.nextLine(); 
				System.out.println("---------------------------");
				System.out.println("Eklemek istediğiniz Kullanıcı Adını giriniz : ");
				String userName=sc.nextLine();
				System.out.println("Kullanıcı şifresini giriniz: ");
				String userPassword=sc.nextLine();
				System.out.println("Kullanıcı mailini giriniz : ");
				String userMail=sc.nextLine();
				User user=new User(null, userName, userPassword, userMail);
				userManager.addUser(user);
				System.out.println("-------------------------------");
				break;
			}
//			sisteme giriş yapmak için
			case 2-> {
				System.out.println("------------------------------");
				sc.nextLine();
				
			
				System.out.println("Giriş yapmak için Kullanıcı adını giriniz: ");
				String UserName=sc.nextLine();
				System.out.println("Giriş için şifrenizi giriniz :");
				String password=sc.nextLine();
				userManager.logIn(UserName, password);
				System.out.println("-------------------------------");
				
//				eğer doğru kullanıcı adı ve şifreyle girdiysem bu do-while çalışacak
				 if(userManager.logIn(UserName, password)==true) {
					System.out.println("girişi başarılı");
					System.out.println();
					printMenu();
					do{
						
					System.out.println("Seçiminizi giriniz: ");
					 choice2=sc.nextInt();
					 System.out.println("--------------------------------");
					switch (choice2) {
//					yeni film eklemek için
					case 1->{
						sc.nextLine();
						
						System.out.println("---------------------");
						System.out.println("Eklemek istediğiniz Filmin adını giriniz: ");
						String filmName=sc.nextLine();
						System.out.println("Eklemek istediğiniz Filmin yönetmenini giriniz: ");
						String directorName=sc.nextLine();
						System.out.println("Eklemek istediğiniz Filmin yayın tarihini giriniz: ");
						String releaseDate=sc.nextLine();
						System.out.println("Eklemek istediğiniz Filmin oyuncularını  giriniz: ");
						String [] actors=sc.nextLine().split(", ");
						System.out.println("eklemek istediğiniz filmin içeriğine dair bilgileri giriniz: ");
						String explanation=sc.nextLine();
						System.out.println("eklemek istediğiniz filmin türünü giriniz: ");
						String type=sc.nextLine();
						System.out.println("eklemek istediğiniz filmin fiyatını giriniz: ");
						Double price=sc.nextDouble();
						Movie newMovie=new Movie(null, filmName, directorName, actors, releaseDate, explanation, type);
						movieManager.addMovie(newMovie);
//						movieManager.listMovies();
						System.out.println("--------------------------------");
						break;
					
					}
//					sistemdeki filmleri listelemek için
					case 2->{
						sc.nextLine();
						System.out.println("--------------------------------");
						movieManager.listMovies();
						System.out.println("--------------------------------");
					}
					
//					sistemdeki filmlerden isim ile arama yapmak için
					case 3->{
						sc.nextLine();
						System.out.println("--------------------------------");
				          System.out.print("Aranacak film adını giriniz: ");
				          
				          String MovieName = sc.nextLine();
				          Movie movie =movieManager.searchMovieByName(MovieName);
				          if (movie == null) {
				            System.out.println("Film bulunamadı");
				            break;
				          }
				          System.out.println(movie);
				          System.out.println("--------------------------------");
				          break;
					}
					
//					sistemden film silmek için
					case 4->{
						sc.nextLine();
						System.out.println("--------------------------------");
						System.out.println("Silmek istediğiniz filmin adını giriniz");
						String movieName=sc.nextLine();
						movieManager.removeFilm(movieName);
						System.out.println("--------------------------------");
						break;
					}
					
//					sistemde kayıtlı userları listelemek için
					case 5->{
						sc.nextLine();
						userManager.listUsers();
						break;
					}
//					sistemdeki kullanıcılardan isim ile arama yapmak için
					case 6->{
						sc.nextLine();
						System.out.println("--------------------------------");
						System.out.println("Aramak istediğin kullanıcıyı gir");
						String userName=sc.nextLine();
						User user=userManager.searchUserByName(userName);
						if(user==null) {
							System.out.println("Kullanıcı bulunamadı");
							break;
						}
						System.out.println(user);
						 System.out.println("--------------------------------");
						break;
					}
					
						
						
//					kullanıcı oturumunu kapatmak için
					case -1 ->{
						if(userManager.logOut()==true) {
						userManager.logOut();
						System.out.println("--------------------------------");
						System.out.println("Oturumunuz kapatıldı");
						System.out.println("--------------------------------");
						printEnterMenu();
						break;
						}
					}
					
					
					default -> printMenu();
					}
					
					
					}
					while (choice2 !=-1);
				}
				else {
					 System.out.println("Kullanıcı adı veya şifre yanlış ");
					 break;
				}
			
		break;	
		}
//	sistemde kayıtlı olan bir user'ı silmek için
			case 3->{
				sc.nextLine();
				System.out.println("--------------------------------");
				System.out.println("Silmek istediğiniz hesabın adını giriniz");
				String name=sc.nextLine();
				System.out.println("Silmek istediğiniz hesabın şifresini giriniz:");
				String password=sc.nextLine();
				if(userManager.logIn(name, password)==true) {
					userManager.removeUser(name);
					System.out.println("--------------------------------");
				}
				else {
					System.out.println("Yanlış işlem");
					System.out.println("--------------------------------");
				}
				printEnterMenu();
			break;
			}
//			uygulamadan çıkmak için
			case -2 ->{
				System.out.println("Uygulama Kapatıldı. İyi günler :)");
			}
			default -> printEnterMenu();
			}
			
			}
			while (choice!=-2);
		}

	
	
	
	private static void printEnterMenu() {
		
		System.out.println("*******Giriş Menüsü*****");
		System.out.println("1: Hesap ekle: ");
		System.out.println("2: Giriş Yap: "); 
		System.out.println("3: Sistemden kayıdınızı(user'ı) silmek için");
		System.out.println("-2 : Uygulamayı kapatmak için");
		System.out.println("--------------------------------");
	}
	private static void printMenu() {
	    System.out.println("##### Menu #####");
	    System.out.println("1: Film ekle");
	    System.out.println("2: Filmleri listele");
	    System.out.println("3: Film ara:");
	    System.out.println("4. Film sil");
	    System.out.println("5: Kullanıcıları listele");
	    System.out.println("6: Kullanıcı ara");
	 
	    System.out.println("-1: Oturumunuz kapatmak için \n\n");
	    System.out.println("--------------------------------");
	  }
}
