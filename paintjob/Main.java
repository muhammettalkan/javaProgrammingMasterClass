package paintjob;

public class Main {

	public static void main(String[] args) {
		getBucketCount(3.4, 2.1, 1.5, 2);

	}
	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets <= 0) {
			return -1;
		}
		 return (int) Math.ceil((width*height-(areaPerBucket*extraBuckets))/areaPerBucket);
		
	}
	
	public static int getBucketCount(double width, double height, double areaPerBucket) {
		if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		return (int) Math.ceil((width*height) / areaPerBucket);
	}
	
	public static int getBucketCount(double areaPerBucket, double area) {
		return (int) Math.ceil(area / areaPerBucket);
	}
	

}
