var topics=function(options) {
  var slideIndices=options.slides;
  var parent=options.parent;
  var children=document.getElementById(parent).children;
  for (var i = 0; i < children.length; i++) {
    children[i].classList.add("topic-inactive");
  }
  var findTopicIndex=function(currentSlideIndex) {
    var topicIndex=0;
    while(topicIndex<children.length && currentSlideIndex>=slideIndices[topicIndex]) {
      topicIndex++;
    }
    return topicIndex;
  }
  return function(deck) {
    deck.on('activate',function(event){
      var topicIndex=findTopicIndex(event.index);
      var topicElement=children[topicIndex];
      topicElement.classList.remove("topic-inactive");
      topicElement.classList.add("topic-active");
    });

    deck.on('deactivate',function(event){
      var topicIndex=findTopicIndex(event.index);
      var topicElement=children[topicIndex];
      topicElement.classList.remove("topic-active");
      topicElement.classList.add("topic-inactive");
    });

  }
}
