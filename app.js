// var topicOptions={
//   parent: 'topics',
//   slides: [2,3]
// };

var deck=bespoke.from(".bespoke-parent",
        [bespoke.plugins.classes(),
         bespoke.plugins.scale('zoom'),
         bespoke.plugins.keys(),
         bespoke.plugins.hash(),
         bespoke.plugins.bullets('li, .bullet'),
         bespoke.themes.simpleSlide()]);

deck.slide(0);
