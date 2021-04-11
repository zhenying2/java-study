import java.util.HashMap; 
import java.util.Map;
import java.util.Set;

class MapTest2 
{
	public static void main(String[] args) 
	{
		Map<String,String> favoriteFruits = new HashMap<String, String>();
		favoriteFruits.put("Apple", "High");
		favoriteFruits.put("Orange", "Medium");
		favoriteFruits.put("Grape", "High");
		favoriteFruits.put("Banna", "Low");

		Set<String> keySet=favoriteFruits.keySet();
		System.out.println("key  "+" : "+"value");
		for (String key : keySet)
		{
			String value=favoriteFruits.get(key);
			System.out.println(key+" : "+value);
		}
	}
}
