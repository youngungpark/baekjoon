

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int commandCount = Integer.parseInt(br.readLine());
		StringBuffer result = new StringBuffer();
		ArrayList stack = new ArrayList();
		for(int i=0; i<commandCount; i++) {
			String command = br.readLine();
			if(command.contains("push")) {
				stack.add(command.substring(5));
			}else if(command.equals("top")) {
				if(stack.isEmpty()) {
					result.append(-1+"\n");
				}else {
					result.append(stack.get(stack.size()-1)+"\n");
				}
			}else if(command.equals("pop")) {
				if(stack.isEmpty()) {
					result.append(-1+"\n");
				}else {
					result.append(stack.get(stack.size()-1)+"\n");
					stack.remove(stack.size()-1);
				}
			}else if(command.equals("size")) {
				result.append(stack.size()+"\n");
			}else if(command.equals("empty")) {
				if(stack.isEmpty()) {
					result.append(1+"\n");
				}else {
					result.append(0+"\n");
				}
			}
		}
		System.out.println(result);
	}

}
