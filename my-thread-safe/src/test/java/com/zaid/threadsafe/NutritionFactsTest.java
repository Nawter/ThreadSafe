package com.zaid.threadsafe;

import static org.junit.Assert.assertEquals;
import static org.mutabilitydetector.unittesting.MutabilityAssert.assertInstancesOf;
import static org.mutabilitydetector.unittesting.MutabilityMatchers.areImmutable;

import org.junit.Before;
import org.junit.Test;

public class NutritionFactsTest {

	private NutritionFacts cocaCola;
	private int calories;
	private int servingSize;
	private int servings;
	private int sodium;
	private int carbohydrate;
	

	@Before
	public void setup() {
		servingSize = 275;
		servings = 11;
		calories = 111;
		sodium = 35;
		carbohydrate = 27;
		cocaCola = new NutritionFacts.Builder(servingSize, servings).calories(calories).sodium(sodium)
				.carbohydrate(carbohydrate).build();
	}

	@Test
	public void checkNutritionFactsSatisfyBuilderPatter() {
		assertEquals(servingSize,cocaCola.getServingSize());
		assertEquals(calories,cocaCola.getCalories());
	}
	
	@Test
	public void checkIfNurtitionFactsIsImmutableUsingMutabilityDetector() {
		assertInstancesOf(NutritionFacts.class, areImmutable());
	}

}
