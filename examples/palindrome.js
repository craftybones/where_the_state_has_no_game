var isPalindrome=function(string) {
  var i=0;
  var j=string.length-1;

  for(;i<=j;i++,j--) {
    if(string[i]!=string[j])
      return false;
  }

  return true;
}
