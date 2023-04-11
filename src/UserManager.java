
public class UserManager {
	
	private User[] allUsers;
	private int userCount;
	User currentUser;

	private User user=new User(1L, "Sedanur Demir", "seda123" , "seda@");
	private User user2=new User(2l,"idil", "idil123","idil@");
	private User user3=new User(3l, "gökçe", "gökçe123", "gökçe@");
	
	public UserManager() {
		allUsers=new User[] {user, user2,user3};
		userCount=allUsers.length;
	}


	public User[] getAllUsers() {
		return allUsers;
	}


	public void setAllUsers(User[] allUsers) {
		this.allUsers = allUsers;
	}


	public int getUserCount() {
		return userCount;
	}


	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}
	



	public void addUser(User user) {
        reInitializeArray();
        
        allUsers[userCount]=user;
        
        userCount++;
        user.setId((long) userCount);
        System.out.println("Kullanıcı eklendi.");
        
    }
	
	public void reInitializeArray() {
		User[] newUserArray = new User[allUsers.length + 1];
        
        System.arraycopy(allUsers, 0, newUserArray, 0, allUsers.length);
        
        allUsers = newUserArray;
	}
	
	
	public void removeUser(String userName) {
//		System.out.println(userCount);
		for(int i=0;i<userCount;i++) {
			if(allUsers[i].getFullName().equalsIgnoreCase(userName)) {
				User [] newUserArray=new User[allUsers.length-1];
				System.arraycopy(allUsers, 0, newUserArray, 0, i);
				System.arraycopy(allUsers, i+1, newUserArray, i, allUsers.length-i-1);
				userCount--;
				System.out.println("--------------------------------");
				System.out.println("Hesap Silindi");
				allUsers=newUserArray;
				return;
			}
			}
			
				System.out.println("Hesap Bulunamadı");
				
			}
	
		public void listUsers() {
		
	    for (User user : allUsers) {
	      System.out.println(user);
	    	}
		}

		public User searchUserById(Long userId) {
			User searchedUser = null;
			for (User user : allUsers) {
				if (user.getId().equals(userId)) {
					searchedUser = user;
					break;
				}
			}
			return searchedUser;
		}

		public User searchUserByName(String userName) {
			User searchedUser = null;
			for (User user : allUsers) {
				if (user.getFullName().equalsIgnoreCase(userName)) {
					searchedUser = user;
       
					break;
				}
			}
			return searchedUser;
		}
	
		 public User findUser(Long id) {
			    User user = null;
			    for (User u : allUsers) {
			      if (u.getId().equals(id)) {
			        user = u;
			      }
			    }
			    return user;
			  }
		 
		 public boolean logIn(String userName, String password) {
			 for(User user :allUsers) {
				 if(user.getFullName().equalsIgnoreCase(userName)&&user.getPassword().equalsIgnoreCase(password)) {
					 currentUser=user;
					 return true;
				 }
			 
			 }
			 return false;
			
		 }
		 
		 public boolean logOut() {
			 if(currentUser!=null) {
//				 System.out.println("Hesabınıdan çıkış yapıldı");
				 currentUser=null;
				 return true;
			 }
			 else return false;
			 }

}
