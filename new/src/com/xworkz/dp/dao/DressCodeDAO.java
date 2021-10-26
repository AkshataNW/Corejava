package com.xworkz.dp.dao;

import com.xworkz.dp.dto.DressCodeDTO;

public class DressCodeDAO {

	private DressCodeDTO[] dressCodeDTOs = new DressCodeDTO[10];
	private int count = 0;

public void create(DressCodeDTO codeDTO) {
		// TODO Auto-generated method stub
		if (this.count < dressCodeDTOs.length && codeDTO != null) {

			this.dressCodeDTOs[this.count++] = codeDTO;
			System.out.println("Create method valid ".concat(codeDTO.getColor()));
		} else {
			System.err.println("Create method is invalid at index ".concat(String.valueOf(count)));
		}

	}

	public void delete(int index) {

		if (index > 0 && index < this.dressCodeDTOs.length) {
			this.dressCodeDTOs[index] = null;
			System.out.println("Delete method invoked @ ".concat(String.valueOf(index)));
		} else {
			System.err.println("Delete method invalid");
		}

	}

	public void update(int index, DressCodeDTO name) {
		// TODO Auto-generated method stub
		if (index > 0 && index < dressCodeDTOs.length && name != null) {
			this.dressCodeDTOs[index] = name;
			System.out.println("update method invoked @ ".concat(String.valueOf(index)));

		} else {
			System.err.println("update method invalid");
		}
	}

	public DressCodeDTO[] getDressCodeDTOs() {
		return dressCodeDTOs;
	}

}
