select * from lots;
select * from offers;

SELECT 
    l.name,
    FORMAT(MIN(amount), 2) AS min_offer,
    FORMAT(ROUND(AVG(amount), 2), 2) AS avg_offer,
    FORMAT(MAX(amount), 2) AS max_offer,
    FORMAT((COUNT(amount)), 2) AS offers
FROM
    lots l,
    offers o
WHERE
    l.id = o.lot_id
GROUP BY o.lot_id
ORDER BY offers DESC;

SELECT
    l.name,
    COUNT(o.amount) AS offers,
    FORMAT(MIN(o.amount), 2) AS min_offer,
    FORMAT(AVG(o.amount), 2) AS avg_offer,
    FORMAT(MAX(o.amount), 2) AS max_offer
FROM lots l
    LEFT JOIN offers o ON l.id = o.lot_id
GROUP BY l.name
ORDER BY offers DESC;

SELECT
    name,
    COUNT(amount) AS offers,
    MIN(amount) AS min_offer,
    FORMAT(AVG(amount), 2) AS avg_offer,
    MAX(amount) AS max_offer
FROM lots 
    LEFT JOIN offers ON Id = lot_id
GROUP BY name
ORDER BY offers DESC; 