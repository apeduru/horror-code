public static double findMin( double[] obj ){
    double min; 
    if( obj[0] < min ){
        findMin(obj);
        min = obj[0]
        for ( int i = obj.size() - 1; i >= 0; i--){
            obj[i+1] = obj[i];
        }
        findMin(obj);
    }
    findMin(obj);
    return min;
}