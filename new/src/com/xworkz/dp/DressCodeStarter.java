package com.xworkz.dp;

import com.xworkz.dp.dao.DressCodeDAO;
import com.xworkz.dp.dto.DressCodeDTO;

public class DressCodeStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DressCodeDTO codeDTO=new DressCodeDTO();
		DressCodeDAO codeDAO=new DressCodeDAO();
		
	
		
		DressCodeDTO codeDTO2=new DressCodeDTO("Nylon", "Black", "Female", 32.0F, 999.99F);
		DressCodeDTO codeDTO3 =new DressCodeDTO("Cotton", "White", "Male", 32.0F, 450.45F);
		DressCodeDTO codeDTO4 =new DressCodeDTO("Polyester", "yellow", "Male", 24.0F, 890.0F);
		
		DressCodeDTO[] codeDTOs=new DressCodeDTO[5];
		//codeDTOs[0]=codeDTO;
		codeDTOs[2]=codeDTO2;
		codeDTOs[0]=codeDTO3;
		codeDTOs[1]=codeDTO4;
		codeDAO.create(null);
		codeDAO.delete(3);
		codeDAO.update(0, codeDTO3);
		
		for (int i = 0; i < codeDTOs.length; i++) {
			DressCodeDTO ref =codeDTOs[i];
			if(ref!=null) {
			
			System.out.println("  ");
			System.out.println(ref.getColor());
			System.out.println(ref.getMaterial());
			System.out.println(ref.getGender());
			System.out.println(ref.getSize());
			System.out.println(ref.getPrice());
			
			}
			else {			
				System.err.println("Dress code is not valid ".concat(String.valueOf(i)));

			
		}
		}
		
		
		
	}
}

		
	
		
