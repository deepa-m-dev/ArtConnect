// Gallery filtering
function filterArtworks(tag) {
    let cards = document.querySelectorAll('.card');
    cards.forEach(card => {
        if(tag === 'all' || card.dataset.tags.includes(tag)) {
            card.style.display = 'block';
        } else {
            card.style.display = 'none';
        }
    });
}

// Example: attach filter buttons
document.querySelectorAll('.filter-btn').forEach(btn => {
    btn.addEventListener('click', () => {
        filterArtworks(btn.dataset.tag);
    });
});
