/**
 * 
 */
package org.jaxws.service.business;

import java.util.ArrayList;
import java.util.List;

/**
 * @author VAIBHAVREDDYGUDDETI Feb 20, 2017
 */
public class ProductCatalogImp {
	List<String> movieList = new ArrayList<String>();
	List<String> newsList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	List<String> sportsList = new ArrayList<String>();

	public ProductCatalogImp() {
		movieList.add("Ironman");
		movieList.add("Superman");
		movieList.add("Batman");
		movieList.add("Spiderman");

		newsList.add("CNN");
		newsList.add("FOX");
		newsList.add("NYTimes");
		newsList.add("abc");

		musicList.add("saavan");
		musicList.add("spotify");
		musicList.add("vevo");
		musicList.add("musicx");

		sportsList.add("NBA");
		sportsList.add("NFL");
		sportsList.add("CRICKET");
		sportsList.add("HOKEY");

	}

	public List<String> getProductCatalogList() {
		List<String> productList = new ArrayList<String>();
		productList.add("Movies");
		productList.add("News");
		productList.add("Music");
		productList.add("Sports");
		return productList;
	}

	public List<String> getProductSpecificList(String category) {
		switch (category.toLowerCase()) {
		case "movies":
			return movieList;

		case "news":
			return newsList;

		case "music":
			return musicList;

		case "sports":
			return sportsList;
		}
		return null;
	}
	
	public boolean addProductsTOList(String product, String category) {
		switch (category.toLowerCase()) {
		case "movies":
			movieList.add(product);
			break;
		case "news":
		    newsList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "sports":
			sportsList.add(product);
			break;
		default:
			return false;
		}
		return true;
	}

	/**
	 * @return
	 */
	public List<Product> getProductCatalogListV2(String category) {
		// TODO Auto-generated method stub
		List<Product> fullList = new ArrayList<>();
		fullList.add(new Product("Test WebServices Book", "EducationBooks", 125.40));
		fullList.add(new Product("Test Another Book", "EducationBooks", 120.40));
		return fullList;
	}

}
