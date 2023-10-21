package penValidation;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

import com.core.Brand;
import com.core.Material;
import com.core.Pen;

public class PenValidation {
	
	public static Brand validateBrand(String brand) throws IllegalArgumentException{
		return Brand.valueOf(brand.toUpperCase());	
	}
	
	public static Material validateMaterial(String material)throws IllegalArgumentException{
		return Material.valueOf(material.toUpperCase());	
	}
	
		
	public static Pen validateAllInputs(String brand, String color, String material, int stock,String listingDate,List<Pen>penList)throws DateTimeParseException ,IllegalArgumentException{
			Brand brandName=validateBrand(brand);
			Material materialName=validateMaterial( material);
			LocalDate dateOfListing=LocalDate.parse(listingDate);
		return new Pen(brandName,color,materialName,stock,brandName.getPrice(),dateOfListing);
	}
	
}
