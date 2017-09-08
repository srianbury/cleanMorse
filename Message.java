public class Message {
	
	public void convertCharToCode(char currentChar){
		switch(currentChar){
			case 'a': A(); break;
			case 'b': B(); break;
			case 'c': C(); break;
			case 'd': D(); break;
			case 'e': E(); break;
			case 'f': F(); break;
			case 'g': G(); break;
			case 'h': H(); break;
			case 'i': I(); break;
			case 'j': J(); break;
			case 'k': K(); break;
			case 'l': L(); break;
			case 'm': M(); break;
			case 'n': N(); break;
			case 'o': O(); break;
			case 'p': P(); break;
			case 'q': Q(); break;
			case 'r': R(); break;
			case 's': S(); break;
			case 't': T(); break;
			case 'u': U(); break;
			case 'v': V(); break;
			case 'w': W(); break;
			case 'x': X(); break;
			case 'y': Y(); break;
			case 'z': Z(); break;
			case 1: one(); break;
			case 2: two(); break;
			case 3: three(); break;
			case 4: four(); break;
			case 5: five(); break;
			case 6: six(); break;
			case 7: seven(); break;
			case 8: eight(); break;
			case 9: nine(); break;
			case ' ': nextLine();  break;
			default: NA();
		}
		
		//tab between letters
		if(currentChar!=' '){ System.out.print("\t"); }
	}
	
	public void dit(){ System.out.print("."); }
	public void dah(){ System.out.print("-"); }
	public void NA(){ System.out.print("n/a"); } //print out na for special characters
	public void nextLine() { System.out.println(); } //print different words on different lines
	
	public void A(){ dit(); dah(); }
	public void B(){ dah(); dit(); dit(); dit(); }
	public void C(){ dah(); dit(); dah(); dit(); }
	public void D(){ dah(); dit(); dit(); }
	public void E(){ dit(); }
	public void F(){ dit(); dit(); dah(); dit(); }
	public void G(){ dah(); dah(); dit(); }
	public void H(){ dit(); dit(); dit(); dit(); }
	public void I(){ dit(); dit(); }
	public void J(){ dit(); dah(); dah(); dah(); }
	public void K(){ dah(); dit(); dah(); }
	public void L(){ dit(); dah(); dit(); dit(); }
	public void M(){ dah(); dah(); }
	public void N(){ dah(); dit(); }
	public void O(){ dah(); dah(); dah(); }
	public void P(){ dit(); dah(); dah(); dit(); }
	public void Q(){ dah(); dah(); dit(); dah(); }
	public void R(){ dit(); dah(); dit(); }
	public void S(){ dit(); dit(); dit(); }
	public void T(){ dah(); }
	public void U(){ dit(); dit(); dah(); }
	public void V(){ dit(); dit(); dit(); dah(); }
	public void W(){ dit(); dah(); dah(); }
	public void X(){ dah(); dit(); dit(); dah(); }
	public void Y(){ dah(); dit(); dah(); dah(); }
	public void Z(){ dah(); dah(); dit(); dit(); }
	
	public void one(){ dit(); dah(); dah(); dah(); }
	public void two(){ dit(); dit(); dah(); dah(); dah(); }
	public void three(){ dit(); dit(); dit(); dah(); dah(); }
	public void four(){ dit(); dit(); dit(); dit(); dah(); }
	public void five(){ dit(); dit(); dit(); dit(); dit(); }
	public void six(){ dah(); dit(); dit(); dit(); dit(); }
	public void seven(){ dah(); dah(); dit(); dit(); dit(); }
	public void eight(){ dah(); dah(); dah(); dit(); dit(); }
	public void nine(){ dah(); dah(); dah(); dah(); dit(); }
	public void zero(){ dah(); dah(); dah(); dah(); dah(); }
}
