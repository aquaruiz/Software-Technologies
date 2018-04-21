const Article = require('../models').Article;

module.exports = {
    createGet: (req, res) => {
        res.render('article/create');
    },

    createPost: (req, res) => {
        let articleArgs = req.body;

        let errorMsg = '';

        if (!req.isAuthenticated){
            errorMsg = 'You should be logged in to write articles!';
        } else if (!articleArgs.title) {
            errorMsg = 'Invalid title!';
        } else if (!articleArgs.content) {
            errorMsg = 'Invalid content!';
        }

        articleArgs.error= errorMsg;

        if (errorMsg) {
            res.render('article/create', {error: errorMsg});
            return;
        }

        articleArgs.authorId = req.user.id;

        Article.create(articleArgs).then(article => {
            res.render('home/index');
        }).catch(err => {
            console.log(err.message);
            res.render('article/create', {error: err.message});
        });
    },

    details: (req, res) => {
        let id = req.params.id;

        Article.findById(id, {include: [
                {
                    model: User,
                }
            ]
        }).then(article => {
            res.render('article/details', article.dataValues)
        });
    },
};