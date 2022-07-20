/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

int guessNumber(int n){
	int l = 1, h = n, mid = -1, t = 0;
    while(h >= l){
        mid = l + ((h-l)/2);
        t = guess(mid);
        if(t == 0)
            break;
        else{
            if(t == -1)
                h = mid-1;
            else
                l = mid+1;
        }
    }
    return mid;
}