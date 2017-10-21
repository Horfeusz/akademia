package pl.atena.edu.akdaemia6;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import pl.atena.edu.akdaemia1.MarkaSamochodu;

public class Mapy {

	public static void main(String[] args) {

		Samochod s1 = new Samochod(MarkaSamochodu.AUDI, BigDecimal.valueOf(150000));
		Samochod s2 = new Samochod(MarkaSamochodu.BMW, BigDecimal.valueOf(200000));
		Samochod s3 = new Samochod(MarkaSamochodu.FIAT, BigDecimal.valueOf(50000));
		Samochod s4 = new Samochod(MarkaSamochodu.FIAT, BigDecimal.valueOf(80000));

		Map<MarkaSamochodu, Samochod> samochody = new HashMap<>();
		samochody.put(s1.getMarka(), s1);
		samochody.put(s2.getMarka(), s2);
		samochody.put(s3.getMarka(), s3);

		System.out.println(samochody.get(MarkaSamochodu.FIAT));

		samochody.put(s4.getMarka(), s4);

		System.out.println(samochody.get(MarkaSamochodu.FIAT));

		samochody.remove(MarkaSamochodu.FIAT);

		System.out.println(samochody.getOrDefault(MarkaSamochodu.FIAT, s4));
	}

}
