var toDiv=function(content,colour) {
  return "<div " + "class='" + colour + "'>" + content + "</div";
}

var words=["black","is","the","new","orange"];

words.map(function(c,i){
  var colour=(i%2==0)?"black":"orange";
  return toDiv(c,colour);
})
