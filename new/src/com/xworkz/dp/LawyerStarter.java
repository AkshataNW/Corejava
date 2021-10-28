package com.xworkz.dp;

import com.xworkz.dp.dao.LawyerDAO;
import com.xworkz.dp.dto.LawyerDTO;

public class LawyerStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LawyerDTO dto = new LawyerDTO();
		LawyerDAO dao = new LawyerDAO();
		LawyerDTO dto2 = new LawyerDTO("Soubii", "LLB", 6, "Female", 32, "HighCourt", 0, 6);
		LawyerDTO dto3 = new LawyerDTO("varshh", "MBBS", 4, "Female", 28, "MiniCourt", 1, 8);
		LawyerDTO dto4 = new LawyerDTO("teju", "DIPLOMA", 8, "Female", 45, "HighCourt", 4, 4);
		LawyerDTO dto5 = new LawyerDTO("Akshhh", "BA", 8, "Female", 22, "SupremeCourt", 8, 1);
		LawyerDTO dto6 = new LawyerDTO("Anush", "BE", 10, "Male", 33, "HighCourt", 7, 1);

		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto5);
		dao.save(null);
		dao.save(null, 0);

		LawyerDTO[] lawyerDTO = dao.getLawyerDTOs();
		lawyerDTO[0] = dto2;// dto6
		 lawyerDTO[1]=dto3;//no value
		lawyerDTO[2] = dto4;
		 lawyerDTO[3]=dto5;
		lawyerDTO[4] = null;
		lawyerDTO[5] = dto3;

		dao.save(dto6, 0);

		dao.delete(1);
		dao.delete(3);
		// dao.delete(5);

		for (int i = 0; i < lawyerDTO.length; i++) {
			LawyerDTO ref = lawyerDTO[i];
			if (ref != null) {
				System.out.println(ref.getName());
				System.out.println(ref.getQualification());
				System.out.println(ref.getGender());
				System.out.println(ref.getExperience());
				System.out.println(ref.getCourttype());
				System.out.println(ref.getCaseswon());
				System.out.println(ref.getCaseslost());
				System.out.println();
			}

		}

		boolean fname = dao.searchByName("hhhhhh");
		System.out.println("The returned type of boolean is : " + fname);
		System.out.println();

//		boolean sname=dao.searchByName(null);
//		System.out.println("The returned type is : " +sname);

		boolean sname = dao.searchCasesWon(4);
		System.out.println("The returned type of boolean is : " + sname);
		System.out.println();

		dao.getQualificationbyname("teju");
		// System.out.println("The qualification by name is : "+deepz);

		int refrs = dao.getExpByName("Anush");
		System.out.println("The lawyer is experienced for : " + refrs);

		LawyerDTO exp = dao.getLawyerWithMaxExp();
		System.out.println(exp);

	}

}
