function bubbles() {
    var count = 200;
    var section = document.querySelector('section');

    var i = 0;
    while (i < count) {
        var bubble = document.createElement('i');
        var x = Math.floor(Math.random() * window.innerWidth);
        var y = Math.floor(Math.random() * window.innerHeight);

        var size = Math.random() * 10;
        bubble.style.left = x + 'px';
        bubble.style.top = y + 'px';
        bubble.style.width = 1 + size + 'px'
        bubble.style.height = 1 + size + 'px'

        bubble.style.animationDuration = 5 + size + 's';
        bubble.style.animationDelay = size + 's';

        section.appendChild(bubble);
        i++
    }
}

bubbles()
