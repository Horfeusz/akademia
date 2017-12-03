package pl.atena.edu.strumienie;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.LongSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class TypyProste {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		IntStream s1 = IntStream.of(1, 0, 1, 0, 1);

		LongStream s2 = LongStream.of(112323, 2133423, 123523, 235335, 2432);

		DoubleStream s3 = DoubleStream.of(0.23434, 0.434, 0.1232);
		
		IntSummaryStatistics ss1 = s1.summaryStatistics();
		
		LongSummaryStatistics ss2 = s2.summaryStatistics();
		
		DoubleSummaryStatistics ss3 = s3.summaryStatistics();
		
	}

}
