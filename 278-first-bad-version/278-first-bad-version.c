// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

int firstBadVersion(int n) {
    int start = 0, end = n, pick = 0;
    int mid = 0;
    while(end >= start){
        mid = start+((end-start)/2);
        if(isBadVersion(mid)){
            pick = mid;
            end = mid-1;
        }
        else
            start = mid+1;
    }
    return pick;
}