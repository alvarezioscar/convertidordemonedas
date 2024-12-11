
# Convertidor de Monedas

Es un programa que se solicta en el primer Challenge de la capacitación de programador para Back End, utilizando el lenguage Java


## Autor

- [@alvarezioscar](https://www.github.com/alvarezioscar)


## Referencia del API utilizado

#### Get all items

```http
  GET https://www.exchangerate-api.com/v6/YOUR-API-KEY/last/USD
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| YOUR-API-KEY | `string` | **Required**. Your API key |

#### Get item

```http
  GET /https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/{monedaOrigen}/{monedaDestino}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| YOUR-API-KEY | `string` | **Required**. Your API key |
| `monedaOrigen`      | `string` | **Required**. Revisar documentación |
| `monedaDestino`      | `string` | **Required**. Revisar documentación |





## Agradecimientos

 - [Alura Latam](http://www.aluracursos.com)
 
